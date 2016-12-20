package jrout.tutorial.corejava.loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		int age1 = 12;
		int age2 = 23;
		int age3 = 45;
		
		int ages[]  = new int[4];
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;
		ages[3] = 40;
		
		
		/*for(int age : ages) {
			System.out.println(age);
		}*/
		
		
		/*for(int i = 0 ; i < ages.length; i ++) {
			System.out.println(ages[i]);
		}*/
		
		int i = 0;
		/*while(i < ages.length) {
			System.out.println(ages[i]);
			i++;
		}*/

		do {
			System.out.println(ages[i]);
			i++;
		} while (i < ages.length);
		
		

	}

}
