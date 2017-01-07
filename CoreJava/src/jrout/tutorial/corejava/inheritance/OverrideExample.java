package jrout.tutorial.corejava.inheritance;

public class OverrideExample {

	public static void main(String[] args) {
		OverrideExample ove = new OverrideExample();
		
		/*
		Employee swEmp = new SoftwareEmployee();
		swEmp.dressCode();
		/// Should wear a black tie and a coat...
		
		 * SofwareEmployee Should wear a black tie and a coat...
		 
		
		Employee hrEmp = new HREmployee();
		hrEmp.dressCode();
		
		Employee obEmp = new OfficeBoyEmployee("Raju", 400, "OfficeBoy", 4);
		obEmp.dressCode();*/
		
		Employee emp = null;
		emp = new SoftwareEmployee();
		ove.printEmp(emp);
		/// Should wear a black tie and a coat...
		/*
		 * SofwareEmployee Should wear a black tie and a coat...
		 */
		
		emp = new HREmployee();
		ove.printEmp(emp);
		
//		emp = new OfficeBoyEmployee("Raju", 400, "OfficeBoy", 4);
//		ove.printEmp(emp);
		ove.printEmp(new OfficeBoyEmployee("Raju", 400, "OfficeBoy", 4));
	}
	
	public void printEmp(Employee emp) {
		emp.dressCode();
	}

}
