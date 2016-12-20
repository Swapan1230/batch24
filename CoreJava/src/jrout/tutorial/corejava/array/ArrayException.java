package jrout.tutorial.corejava.array;

public class ArrayException {

	public static void main(String[] args) {
		
		
		int age1 = 12;
		int age2 = 23;
		int age3 = 45;
		
		int ages[]  = new int[4];//{age1, age2,age3}; 0 1 2 3
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;
		ages[3] = 40;
		ages[4] = 50;
//		System.out.println(ages[4]);
	}
}
