package jrout.tutorial.corejava.inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		InheritanceExample ie = new InheritanceExample();
		
		HREmployee hrEmp = new HREmployee();
		hrEmp.setName("Vandita");
		hrEmp.setHiringSkills("VeryGOOD");
//		System.out.println(hrEmp.getName());
//		System.out.println(hrEmp.getHiringSkills());
		
		SoftwareEmployee swEmp = new SoftwareEmployee();
		swEmp.setName("Rajeev");
		swEmp.setProgSkills("JAVA");
		System.out.println(swEmp.getName());
		
		
		//A Superclass Variable Can Reference a Subclass Object.

//		Employee obj1 = new SoftwareEmployee();
//		Employee obj2 = new HREmployee();
		
		ie.printEmployeeInfo(swEmp);
		ie.printEmployeeInfo(hrEmp);
		
//		OfficeBoyEmployee obe = new OfficeBoyEmployee("Raju",300,"OfficeBoy",5);
//		obe.printOfficeBoyDetails();
		
	}
	
	
	/*public void printEmployeeInfo(SoftwareEmployee se){
		System.out.println("Name = "+ se.getName());
		System.out.println("ID = "+ se.getId());
		System.out.println("Occupation = "+ se.getOccupation());
		System.out.println(se.getProgSkills());
	}
	
	public void printEmployeeInfo(HREmployee he){
		System.out.println("Name = "+ he.getName());
		System.out.println("ID = "+ he.getId());
		System.out.println("Occupation = "+ he.getOccupation());
		System.out.println(he.getHiringSkills());
	}*/
	
	public void printEmployeeInfo(Employee emp){
		System.out.println("Name = "+ emp.getName());
		System.out.println("ID = "+ emp.getId());
		System.out.println("Occupation = "+ emp.getOccupation());
		if(emp instanceof HREmployee){
			HREmployee hrEmp = (HREmployee)emp;
			System.out.println(hrEmp.getHiringSkills());
		}
		// Print the programing skills of an IT employee
		
		
	}
}
