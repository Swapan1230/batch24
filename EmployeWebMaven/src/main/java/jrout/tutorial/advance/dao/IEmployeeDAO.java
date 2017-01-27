package jrout.tutorial.advance.dao;

import java.util.List;

import jrout.tutorial.advance.domain.Employee;

public interface IEmployeeDAO {
	public Employee fetchEmployee(int empId);
	public List<Employee> fetchEmployees(String gender);
}
