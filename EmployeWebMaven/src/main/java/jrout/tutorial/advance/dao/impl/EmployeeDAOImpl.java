package jrout.tutorial.advance.dao.impl;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.advance.dao.IEmployeeDAO;
import jrout.tutorial.advance.domain.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	
	String driverName = "com.mysql.jdbc.Driver";
	String connectionURL = "jdbc:mysql://localhost:3306/employees";
	String connectionUserName = "root";
	String connectionPassword = "root";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public EmployeeDAOImpl(){
		try {
			Class.forName(driverName);
			System.out.println("Driver Loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public Employee fetchEmployee(int empId) {
		Employee emp = null;
		try {
			con = DriverManager.getConnection(connectionURL, connectionUserName, connectionPassword);
			System.out.println("Connection is established...");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees where emp_no = "+ empId);
			
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeNo(empId);
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return emp;
	}

	
	/**
	 * 
	 */
	public List<Employee> fetchEmployees(String gender) {
		Employee emp = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			con = DriverManager.getConnection(connectionURL, connectionUserName, connectionPassword);
			System.out.println("Connection is established...");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees where gender = '"+ gender+"'");
			
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeNo(rs.getInt(1));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				
				employees.add(emp);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return employees;
	}

	/**
	 * This is for closing the connections...
	 */
	private void closeConnection(){
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
