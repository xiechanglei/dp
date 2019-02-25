package me.coldsoul.code.dp.builder;

import java.sql.Connection;

public class BuilderTest {
	public static void main(String[] args) throws Exception {
		Connection connection = ConnectionManager.getConnection(new MysqlConnectionBuilder("", "", ""));
		connection.close();
		connection = ConnectionManager.getConnection(new OracleConnectionBuilder("", "", ""));
		connection.close();
	}
}
