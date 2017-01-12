package jrout.tutorial.corejava.threads;

public class Waiter implements Runnable{
	public String name;
	
	public Waiter(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i = 0 ; i < 5; i++) {
			System.out.println(name +" Serving...." + i + " " + Thread.currentThread().getName());
		}
	}
}
