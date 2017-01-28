package jrout.tutorial.advance.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import jrout.tutorial.advance.dao.IEmployeeDAO;
import jrout.tutorial.advance.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.advance.domain.Employee;

public class EmployeeDAOTest {

	@Before
	public void setUp() throws Exception {
		
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void fetchEmployeeTest(){
		IEmployeeDAO employeeDao = new EmployeeDAOImpl();
		Employee emp = employeeDao.fetchEmployee(10001);
//		assertNotNull(emp);
		System.out.println(emp.getFirstName());
		//assertEquals("Jayram", emp.getFirstName());
		
	}

	@Test
	public void testFetchEmployees(){
		
	}
}
