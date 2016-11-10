package com.mtime.springboot.support.dao;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
//@Component("dataSourceSupport")
//@Order(Ordered.LOWEST_PRECEDENCE)
//@Bean(name="DataSourceSupport")
public class DataSourceSupport extends SqlSessionDaoSupport {
	
	public int insert(String insertId, Object parameter) {
		return getSqlSession().insert(insertId, parameter);
	}

	public int update(String updateId, Object parameter) {
		return getSqlSession().update(updateId, parameter);
	}
	
	public int delete(String deleteId, Object parameter) {
		return getSqlSession().delete(deleteId, parameter);
	}

	public <M> M selectOne(String selectId, Object parameter) {
		return getSqlSession().selectOne(selectId, parameter);
	}

	public <E> List<E> selectList(String selectId, Object parameter) {
		return getSqlSession().selectList(selectId, parameter);
	}

	public <E> List<E> selectLimitedList(String selectId,Object parameter, RowBounds rowBounds) {
		return getSqlSession().selectList(selectId, parameter,rowBounds);
	}
	public int selectCount(String countId, Object parameter) {
		return getSqlSession().selectOne(countId, parameter);
	}
}
