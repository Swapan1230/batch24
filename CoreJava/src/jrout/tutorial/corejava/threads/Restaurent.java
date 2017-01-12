package jrout.tutorial.corejava.threads;

public class Restaurent {

	public static void main(String[] args) {
		
		Waiter waiter = new Waiter("DavidWaiter");
		
		Customer raja = new Customer("Raja",waiter);
		Customer rohit = new Customer("Rohit",waiter);
		
		raja.start();
		rohit.start();
		
		/*Thread one = new Thread(waiter,"One");
		
		Thread two = new Thread(waiter,"Two");
		
		one.start();
		two.start();*/
	}

}
