package com.mtime.springboot.support.database;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源（需要继承AbstractRoutingDataSource）
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();
	
	public static void setDataSourceKey(DatabaseType databaseType) {
		contextHolder.set(databaseType);
    }
	
	public static DatabaseType getDatabaseType(){
        return contextHolder.get();
    }
	
    protected Object determineCurrentLookupKey() {
        return contextHolder.get();
    }
}