package jrout.tutorial.corejava.threads;

public class ThreadClient {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getName());
		/*for(int i = 0; i < 3 ; i++) {
			new ExamPerson("Name"+i).start();
		}*/
		
		ExamPerson one = new ExamPerson("One");
		one.start();
		System.out.println(one.isAlive());
		Thread.sleep(3000);
		System.out.println(one.isAlive());
		
		one.start();
		
		System.out.println("I am done...");
	}
}

