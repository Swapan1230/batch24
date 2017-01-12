package jrout.tutorial.corejava.threads;

//public class ExamPerson extends Thread {
public class ExamPerson extends Thread {
	private String name;
	
	public ExamPerson(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void run(){
		for(int i = 0 ; i < 3 ; i++) {
			/*try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println(name +" Writing Exam "+ i + "   "+ Thread.currentThread().getName() +" "+ Thread.currentThread().isAlive());
			
		}
		
		
	}
}
