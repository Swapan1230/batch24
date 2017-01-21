package jrout.tutorial.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {

	public static void main(String[] args) {
		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
		String oracleConnectionURL = "jdbc:oracle:thin:@localhost:1521/XE";

		String driverName = "com.mysql.jdbc.Driver";
		String connectionURL = "jdbc:mysql://localhost:3306/employees";
		String connectionUserName = "root";
		String connectionPassword = "root";
		String selectQuery = "SELECT * FROM employees where emp_no = 10001";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driverName);
			System.out.println("Driver Loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(connectionURL, connectionUserName, connectionPassword);
			System.out.println("Connection is established...");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees");
			while (rs.next()) {
				System.out.println(rs.getString("first_name") + " \t" + rs.getString("last_name"));
				;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
