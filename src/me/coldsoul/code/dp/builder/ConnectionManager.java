package me.coldsoul.code.dp.builder;

import java.sql.Connection;

public class ConnectionManager {
	public static Connection getConnection(ConnectionBuilder builder) throws Exception {
		return builder.build();
	}
}
