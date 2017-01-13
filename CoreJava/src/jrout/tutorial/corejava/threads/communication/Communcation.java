package jrout.tutorial.corejava.threads.communication;

public class Communcation {

	public static void main(String[] args) throws InterruptedException {
		
		Calculator calc = new Calculator();
		Thread calcThread = new Thread(calc);
		
		Reader one = new Reader(calc,"One");
		Reader two = new Reader(calc,"Two");
		Reader three = new Reader(calc,"Three");
		
		one.start();
		two.start();
		three.start();
		
		calcThread.start();
	}
}

class Reader extends Thread{
	Calculator calc;
	String name;
	public Reader(Calculator calc, String name){
		this.calc = calc;
		this.name = name;
	}
	
	public void run(){
		
		synchronized(calc){
			try {
				System.out.println(name +" Waiting for the calculator to finish...");
				calc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println( name + " Reader got the Value = "+ calc.total);
		}
	}
}

class Device {
	public String type;
}

class Calculator extends Device implements Runnable {
	
	int total = 0;
	public void run(){
		synchronized(this){
			for(int i = 0 ; i< 5 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				total += i;
			}
			
			notifyAll();
		}
		
	}
}
