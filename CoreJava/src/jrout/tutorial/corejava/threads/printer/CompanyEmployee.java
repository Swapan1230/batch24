package jrout.tutorial.corejava.threads.printer;

public class CompanyEmployee extends Thread {
	public CompanyEmployee(String name, Printer waiter) {
		super(waiter);
		setName(name);
	}
}
