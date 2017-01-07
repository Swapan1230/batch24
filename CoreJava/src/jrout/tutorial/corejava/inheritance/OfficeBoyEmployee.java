package jrout.tutorial.corejava.inheritance;

public class OfficeBoyEmployee extends Employee {
	
	
	public OfficeBoyEmployee(String name , int id, String occupation, int yrExp) {
		super(name,id,occupation,yrExp);
		
	}
	
	
	public void printOfficeBoyDetails(){
		System.out.println("Office Boy Name =" + super.getName());
		System.out.println("Office Boy ID =" + super.getId());
		System.out.println("Office Boy Occupation =" + super.getOccupation());
		System.out.println("Office Boy Occupation =" + super.getYearOfExp());
	}
}
