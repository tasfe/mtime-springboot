package com.mtime.springboot.support.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import com.github.pagehelper.PageInfo;
import com.mtime.springboot.spring.SpringBeanUtil;
import com.mtime.springboot.support.pager.DataPager;
import com.mtime.springboot.support.pager.Pager;

public class SqlMapper {
	private String namespace;
	private DataSourceSupport dataSourceSupport;
	public SqlMapper(String namespace){
		this.namespace=namespace;
		this.dataSourceSupport=SpringBeanUtil.getBean("dataSourceSupport", DataSourceSupport.class);
	}
	
	public int insert(String insertId, Object parameter) {
		insertId=namespace+"."+insertId;
		return dataSourceSupport.insert(insertId, parameter);
	}

	public int update(String updateId, Object parameter) {
		updateId=namespace+"."+updateId;
		return dataSourceSupport.update(updateId, parameter);
	}

	public int delete(String deleteId, Object parameter) {
		deleteId=namespace+"."+deleteId;
		return dataSourceSupport.delete(deleteId, parameter);
	}

	public <M> M selectOne(String selectId, Object parameter) {
		selectId=namespace+"."+selectId;
		return dataSourceSupport.selectOne(selectId, parameter);
	}

	public <E> List<E> selectList(String selectId, Object parameter) {
		selectId=namespace+"."+selectId;
		return dataSourceSupport.selectList(selectId, parameter);
	}
	
	public<M> M  selectFirstFromList(String selectId, Object parameter) {
		selectId=namespace+"."+selectId;
		List<M> ls=dataSourceSupport.selectList(selectId, parameter);
		if(ls.size()>0){
			return ls.get(0);
		}
		return null;
	}
	
	public <E> List<E> selectLimitedList(String selectId,Object parameter, RowBounds rowBounds) {
		selectId=namespace+"."+selectId;

		return dataSourceSupport.selectLimitedList(selectId, parameter, rowBounds);
	}	

	public int selectPageCount(String countId, Object parameter) {
		countId=namespace+"."+countId;
		return dataSourceSupport.selectOne(countId, parameter);
	}
	
	public <E> DataPager<E> selectByPage(String selectId, Object params,Pager pager) {
		DataPager<E> dataPager=new DataPager<E>(pager);
		selectId=namespace+"."+selectId;
		RowBounds rowBounds = new RowBounds(pager.getPage(), pager.getRows());
		List<E> results = dataSourceSupport.selectLimitedList(selectId, params, rowBounds);
		dataPager.setRows(results);
		PageInfo page = new PageInfo(results);
		dataPager.setTotal(page.getTotal());
		//dataPager.setTotal();
		return dataPager;
	}
}
