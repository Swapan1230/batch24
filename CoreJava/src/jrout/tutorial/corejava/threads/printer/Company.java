package jrout.tutorial.corejava.threads.printer;

public class Company {

	public static void main(String[] args) {
		
		Printer printer = new Printer("FirstFloorPrinter");
		
		CompanyEmployee raja = new CompanyEmployee("Raja",printer);
		CompanyEmployee rohit = new CompanyEmployee("Rohit",printer);
		
		raja.start();
		rohit.start();
		
		/*Thread one = new Thread(waiter,"One");
		
		Thread two = new Thread(waiter,"Two");
		
		one.start();
		two.start();*/
	}

}
