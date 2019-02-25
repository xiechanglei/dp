package me.coldsoul.code.dp.builder;

import java.sql.Connection;

public interface ConnectionBuilder {

	public Connection build() throws Exception;

	public void loadDriver() throws Exception;

	public void connect() throws Exception;
}
