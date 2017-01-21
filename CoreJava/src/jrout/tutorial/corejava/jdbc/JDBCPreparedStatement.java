package jrout.tutorial.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPreparedStatement {
	static Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String selectQuery = "SELECT * FROM employees";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
    
	public static void main(String[] args) {
		
		JDBCPreparedStatement ps = new JDBCPreparedStatement();
		ps.preparedStatement(10001, "Georgi");
	
	
	}

	
	public void preparedStatement(int empid, String firstName) {
        try {
            pstmt = con
                    .prepareStatement("SELECT * FROM employees where emp_no = ? and first_name = ?");
            
            pstmt.setInt(1, empid);
            pstmt.setString(2, firstName);
            
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " "
                        + rs.getString("last_name") + " " + rs.getString(1));
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, pstmt, con);
        }
    }
	
	private void closeConnections(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}
