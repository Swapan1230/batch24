package jrout.tutorial.corejava.inheritance;

public class HREmployee extends Employee {
	
	private String hiringSkills;
	private String desig;
	
	public HREmployee(){}
	public HREmployee(String desig) {
		this.desig = desig;
	}
	public String getHiringSkills() {
		return hiringSkills;
	}
	public void setHiringSkills(String hiringSkills) {
		this.hiringSkills = hiringSkills;
	}
	
	@Override
	public void dressCode(){
		System.out.println(desig + " Should wear a black tie and a white coat...");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
