package jrout.tutorial.corejava.threads.printer;

public class Printer implements Runnable{
	public String name;
	
	public Printer(String name){
		this.name = name;
	}
	
	public synchronized void run() {
		runMe();
		runMe2();
	}
	
	public void runMe(){
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println(name +" Serving...." + i + " " + Thread.currentThread().getName());
		}
	}
	public void runMe2(){
		
	}
}
