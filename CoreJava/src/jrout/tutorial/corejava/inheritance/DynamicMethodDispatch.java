package jrout.tutorial.corejava.inheritance;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Employee emp = null;
		
		emp = new HREmployee("HRFinance");
		emp.dressCode();
		
		emp = new HREmployee("HRIt");
		emp.dressCode();
		
		emp = new HREmployee("VP"){
			@Override
			public void dressCode() {
				System.out.println("VP IS GOING TO WEAR A SAFARI...");
			}
		};
		
		emp.dressCode();
		
	}
}
