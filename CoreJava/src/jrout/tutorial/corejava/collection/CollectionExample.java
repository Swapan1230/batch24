package jrout.tutorial.corejava.collection;

import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.corejava.classes.Employee;

public class CollectionExample {

	public static void main(String[] args) {
		/*List list = new ArrayList();
		list.add("Jayram");
		list.add(new Employee("Testig"));
		list.add(new Integer(100));
		list.add(67);
		
		System.out.println(list);*/
		
		
		
		/*for(int i = 0 ; i < list.size() ; i ++) {
			System.out.println(list.get(i));
		}*/
		
		
		
		List employees = new ArrayList();
		employees.add(new Employee("Raj"));
		employees.add(new Employee("Rohan"));
		employees.add(new Employee("Seema"));
		employees.add(new Employee("Purohit"));
		
		System.out.println(employees.size());
		
		System.out.println(employees.get(2));
		
	}

}
