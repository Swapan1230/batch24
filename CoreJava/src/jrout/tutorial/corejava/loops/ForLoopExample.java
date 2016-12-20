package jrout.tutorial.corejava.loops;

public class ForLoopExample {

	public static void main(String[] args) {
		
		int age1 = 12;
		int age2 = 23;
		int age3 = 45;
		
		int ages[]  = new int[4];
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;
		ages[3] = 40;
		
		
		for(int age : ages) {
			System.out.println(age);
		}
		
	}

}
