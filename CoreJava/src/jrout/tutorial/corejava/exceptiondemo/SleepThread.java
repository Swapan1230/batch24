package jrout.tutorial.corejava.exceptiondemo;

public class SleepThread {

	public static void main(String[] args) {
		for(int i = 0 ;i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Value ="+ i);
		}

	}

}
