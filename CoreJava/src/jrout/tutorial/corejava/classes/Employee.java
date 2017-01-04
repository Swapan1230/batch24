package jrout.tutorial.corejava.classes;

// POJO (Plain Old Java Object)/ DomainObject / 
public class Employee {
	final public  String companyName = "H2k";
	
	String address;
	private String name;
	private int id;
	private String department;
	private int experience;
	private int age;
	
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
	
	public Employee(String nameX, int idX, String dept , int experience, int age) {
		this(nameX, idX, dept);
		this.experience = experience;
		this.age = age;
	}
	
	public void setAge(int age) {
		if(age <=15 ){
			this.age = 16;
		}else{
			this.age = age;	
		}
		
	}
	public int getAge(){
		return this.age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String toString() {
		return this.name +" " + this.id +" " + this.department +" " + this.experience +" "+ this.age;
	}
}
