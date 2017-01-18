package jrout.tutorial.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import jrout.tutorial.corejava.classes.Employee;

public class GenricsExample {

	public static void main(String[] args) {
		
		List<Employee> employees = getEmployees();
		/*for(int i = 0 ; i < employees.size(); i++){
			Employee emp = (Employee)employees.get(i);
			System.out.println(emp.getName());
		}*/
		
		/*for(int i = 0 ; i < employees.size(); i++){
			Employee emp = employees.get(i);
			System.out.println(emp);
		}*/
		
		/*for(Employee emp : employees) {
			System.out.println(emp.getName());
		}*/
//		listExample();
		setExamples();
	}

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Raj",23));
		
		employees.add(new Employee("Rohan",45));
		employees.add(new Employee("Seema",46));
		employees.add(new Employee("Purohit",78));
		
		
		employees.add(1, new Employee("Raja",444));
//		employees.add("Java Course");
		return employees;
	}
	
	public static void listExample() {
		List<String> names = new ArrayList<String>();
		names.add("Hanirutha");
		names.add("Raja");
		names.add("Anand");
		names.add("Anand");
		names.add("Rekha");
		names.add("Ashutosh");
		names.add("Chandini");
		
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println(names);
		
		Set set = new HashSet<>(names);
		System.out.println(set);

	}
	
	public static void setExamples() {
//		Set<String> names = new HashSet<String>();
		Set<String> names = new TreeSet<String>();
		names.add("Hanirutha");
		names.add("Raja");
		names.add("Anand");
//		names.add("Anand");
		names.add("Rekha");
		names.add("Ashutosh");
		names.add("Chandini");
		
		System.out.println(names);
		
	}
}
