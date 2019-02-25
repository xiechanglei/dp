package me.coldsoul.code.dp.builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionBuilder implements ConnectionBuilder {
	private String url, user, pass;
	private Connection connection;

	public OracleConnectionBuilder(String url, String user, String pass) {
		this.url = url;
		this.user = user;
		this.pass = pass;
	}

	@Override
	public Connection build() throws ClassNotFoundException, SQLException {
		loadDriver();
		connect();
		return connection;
	}

	@Override
	public void loadDriver() throws ClassNotFoundException {
		Class.forName("xxxxxx");
	}

	@Override
	public void connect() throws SQLException {
		connection = DriverManager.getConnection(url, user, pass);
	}

}
