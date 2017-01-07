package jrout.tutorial.corejava.inheritance;

public class Employee {
	
	// employeeType
	private String name;
	private int id;
	private String occupation;
	private int yearOfExp;
	public Employee(){
	}
	
	public Employee(String name , int id, String occupation, int yrExp) {
		this.name = name;
		this.id = id;
		this.occupation = occupation;
		this.yearOfExp = yrExp;
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getYearOfExp() {
		return yearOfExp;
	}
	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	
	
	public void dressCode(){
		//System.out.println(employeeType + "Should wear a black tie and a coat...");
		System.out.println("Should wear a black tie and a coat...");
	}
}
