package jrout.tutorial.corejava.condition;

public class BreakContinueExample {

	public static void main(String[] args) {
		int val = 0;
		int Val = 23;
		
		/*for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println("");
		}*/

		
		/*
		 * Continue will not allow the code below and move to
		 * the next loop
		 */
		/*for (int i = 0; i < 10; i++) {
			
			if(i ==4)
				continue;
			
			System.out.println(i);
		}*/
		
		
		for (int i = 0; i < 10; i++) {
			
			if(i ==4)
				break;
			
			System.out.println(i);
		}
		
		
		
		int ages[]  = {0,1,2,3,4,5,6,7,8,9,13,14,17,19};
		
		int inputValue = 2;
		for(int i =0 ; i < ages.length ; i++){
			if(ages[i] == inputValue) {
				System.out.println("Yes you have the input value " + ages[i] +" In the age group");
				break;
			}
		}
		/**
		 * Enhanced For loop
		 */
		for(int age : ages){
			if(age == inputValue) {
				System.out.println("Yes you have the input value " + age +" In the age group");
				break;
			}
		}
		
		// Yes you have the input value
		
	}

}
