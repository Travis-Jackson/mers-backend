package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection conn;

	static {

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static Connection obtainConnection() {

		String connectionUrl = "jdbc:postgresql://localhost:5432/mers";
		String userName = "postgres";
		String password = "1234";

		if(conn == null) {
			try {
				conn = DriverManager.getConnection(connectionUrl, userName, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return conn;
	}

	static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
