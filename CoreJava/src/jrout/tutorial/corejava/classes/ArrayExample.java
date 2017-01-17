package jrout.tutorial.corejava.classes;
import jrout.tutorial.corejava.classes.Employee;

public class ArrayExample {

	public static void main(String[] args) {
//		int ages[] = {1,2,3,4,5,6,"dfdfd"};
		int age = 45;
		Integer ageInt = age;
		
		int myAge = ageInt;
		
		String name = "Jayram";
		
		int mathMark = 45;
		
		Employee emp = new Employee("");
		
//		int everyThing[] = {name,mathMark,emp};
		
		Object everyThing [] = {name,mathMark,emp};
		
		
		
		System.out.println(everyThing);
		
		add(everyThing,"Testing");
		
		
	}
	
	public static void add(Object source[] , Object val) {
		
	}

}
