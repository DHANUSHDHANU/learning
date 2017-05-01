package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManage {

	private static Connection con;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/cimbidia", "root", "root");

			
		} catch (Exception e) {
			System.out.println();
			System.out.println(e);
		}
		return con;
	}

}
