package com.mtime.springboot.spring;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mtime.springboot.support.dao.DataSourceSupport;
import com.mtime.springboot.support.database.DatabaseType;
import com.mtime.springboot.support.database.DynamicDataSource;


/**
 * springboot集成mybatis的基本入口 1）创建数据源(如果采用的是默认的tomcat-jdbc数据源，则不需要)
 * 2）创建SqlSessionFactory 3）配置事务管理器，除非需要使用事务，否则不用配置
 */
@Configuration // 该注解类似于spring配置文件
@MapperScan(basePackages = "com.mtime.**.mapper",sqlSessionFactoryRef="sqlSessionFactory")
public class MyBatisConfig {

    @Autowired
    private Environment env;

    /**
     * 创建数据源(数据源的名称：方法名可以取为XXXDataSource(),XXX为数据库名称,该名称也就是数据源的名称)
     */
    @Bean(name="dataSourceA")
    public DataSource dataSourceA() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
        props.put("url", env.getProperty("jdbc.url"));
        props.put("username", env.getProperty("jdbc.username"));
        props.put("password", env.getProperty("jdbc.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    @Bean(name="dataSourceB")
    public DataSource dataSourceB() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc2.driverClassName"));
        props.put("url", env.getProperty("jdbc2.url"));
        props.put("username", env.getProperty("jdbc2.username"));
        props.put("password", env.getProperty("jdbc2.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    /**
     * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
     * @Qualifier 根据名称进行注入，通常是在具有相同的多个类型的实例的一个注入（例如有多个DataSource类型的实例）
     */
    @Bean(name="dynamicDataSource")
    @Primary
    public DynamicDataSource dynamicDataSource(@Qualifier("dataSourceA") DataSource dataSourceA,
            @Qualifier("dataSourceB") DataSource dataSourceB) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DatabaseType.dataSourceA, dataSourceA);
        targetDataSources.put(DatabaseType.dataSourceB, dataSourceB);

        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
        dataSource.setDefaultTargetDataSource(dataSourceA);// 默认的datasource设置为myTestDbDataSource

        return dataSource;
    }

    /**
     * 根据数据源创建SqlSessionFactory
     */
    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dynamicDataSource") DynamicDataSource dynamicDataSource) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(dynamicDataSource);// 指定数据源(这个必须有，否则报错)
        // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        //fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));// 指定基包
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));//
        fb.setConfigLocation(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.configLocation"))[0]);
        return fb.getObject();
    }
    
    @Bean(name="dataSourceSupport")
    public DataSourceSupport dataSourceSupport(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory){
    	DataSourceSupport dss=new DataSourceSupport();
    	dss.setSqlSessionFactory(sqlSessionFactory);
    	return dss;
    }

    /*@Bean(name="mapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer(){
    	MapperScannerConfigurer mc=new MapperScannerConfigurer();
    	mc.setBasePackage("com.mtime.**.dao.**.mapper");
    	mc.setSqlSessionFactoryBeanName("sqlSessionFactory");
    	return mc;
    }*/
    
    /**
     * 配置事务管理器
     
    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
    */

}