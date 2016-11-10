package com.mtime.springboot.support.dao;
import org.springframework.stereotype.Component;

import com.mtime.springboot.support.database.DatabaseType;
import com.mtime.springboot.support.database.DynamicDataSource;



@Component("commDAO")
public class CommDAO {
	
	/**
	 * 使用默认数据源
	 * 通过daoName初始化 MyBatisSqlDAO
	 * @param daoName
	 * @return MyBatisSqlDAO
	 */
	public SqlMapper initDAO(String daoName){
		return defaultDB().initDAO(daoName);
	}
	
	public SqlMapper initDAO(String namespace,String daoName){
		return defaultDB().initDAO(namespace,daoName);
	}
	
	/**
	 * 使用默认数据源
	 * @param cls POJO对象
	 * @return
	*/
	public TableMapper initDAO(Class cls){
		return defaultDB().initDAO(cls);
	}	
	/**
	 * 
	  * initDAO(使用默认table构造)
	  *
	  * @Title: initDAO
	  * @Description: TODO
	  * @param @return    
	  * @return TableDefaultMapper    
	  * @throws
	 */
	public TableDefaultMapper initDAO(){
		return defaultDB().initDAO();
	}
	
	/**
	 * 使用 默认的数据源
	 * @return
	 */
	
	public DAOBuilder defaultDB(){
		DynamicDataSource.setDataSourceKey(DatabaseType.dataSourceA);
		return new DAOBuilder();
	}
	
	public DAOBuilder readDB(){
		DynamicDataSource.setDataSourceKey(DatabaseType.dataSourceB);
		return new DAOBuilder();
	}
	
	public DAOBuilder setDB(DatabaseType dt){
		DynamicDataSource.setDataSourceKey(dt);
		return new DAOBuilder();
	}
	
}
