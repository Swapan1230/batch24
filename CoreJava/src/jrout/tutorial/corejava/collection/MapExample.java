package jrout.tutorial.corejava.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import jrout.tutorial.corejava.classes.Employee;

public class MapExample {

	public static void main(String[] args) {
		
		/*Map mapStringString = new Hashtable<>();
		mapStringString.put("1", "One");
		mapStringString.get("1");*/
		Map<String,List<Employee>> map = new HashMap<>();
//		Map map = new Hashtable<>();
		List<Employee> itEmployees = getITEmployees();
		List<Employee> hrEmployees = getHREmployees();
		
		map.put("IT", itEmployees);
		map.put("HR", hrEmployees);
		
		map.put("OfficeBoys",null);
		
//		List<Employee> empFromMap = (List<Employee>)map.get("IT");
		List<Employee> empFromMap = map.get("IT");
		System.out.println(empFromMap);
		
		
	}
	
	
	public static List<Employee> getITEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Raj",23,"IT"));
		employees.add(new Employee("Rohan",45,"IT"));
		employees.add(new Employee("Seema",46,"IT"));
		employees.add(new Employee("Purohit",78,"IT"));
		employees.add(1, new Employee("Raja",444,"IT"));
		return employees;
	}

	
	public static List<Employee> getHREmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("RajHR",234,"HR"));
		employees.add(new Employee("RohanHR",445,"HR"));
		employees.add(new Employee("SeemaHR",464,"HR"));
		employees.add(new Employee("PurohitHR",748,"HR"));
		employees.add(1, new Employee("RajaHR",4444,"IT"));
		return employees;
	}
}
