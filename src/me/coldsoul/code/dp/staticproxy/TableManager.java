package me.coldsoul.code.dp.staticproxy;

/**
 * 数据库表管理
 */
public interface TableManager {
	void empty();// 清空表

	int count();// 表当前数据

	void executeSql(String sql);// 执行sql
}
