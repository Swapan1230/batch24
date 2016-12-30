package jrout.tutorial.corejava.classes;

public class Employee {
	public String name;
	public int id;
	public String department;
	public int experience;
	
	public Employee(String name) { 
		this.name = name;
	}
	
	public Employee(String name, int id) { 
		this.name = name;
		this.id = id;
	} 
	
	public Employee(String nameX, int idX,String dept) {
		this(nameX,idX);
		department = dept;
	}
	
	public Employee(String nameX, int idX, String dept , int experience) {
		this(nameX, idX, dept);
		this.experience = experience;
	}
	
	public String toString() {
		return this.name +" " + this.id +" " + this.department +" " + this.experience;
	}
}
