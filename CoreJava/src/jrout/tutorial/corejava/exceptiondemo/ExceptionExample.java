package jrout.tutorial.corejava.exceptiondemo;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Please enter your input");
		//int input = scan.nextInt();
		
//		System.out.println("Input Value = "+input);
		int age[] = {3,4,5,6,7,8,91,23,67};
		int input = 1;
		int myCalculation = 0;
		int ageFromArray = 0;
		try{
			
			myCalculation = 10 /input; // ArithimeticException
			ageFromArray = age[myCalculation];
			
			System.out.println("ageFromArray "+ageFromArray);
			
		}catch(ArrayIndexOutOfBoundsException aiobe){
			aiobe.printStackTrace();
			ageFromArray = 5;
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			myCalculation = 4;
			/*try{
				
			}catch(Exception exp){
				
			}*/
		}catch(Exception exp){
			exp.printStackTrace();
			ageFromArray = 7;
			myCalculation = 7;
		}finally{
			System.out.println("This is finally Block...");
		}
		
		System.out.println("ageFromArray Outside = "+ ageFromArray);
		System.out.println("myCalculation "+myCalculation);
	
		int myAdditionCalc = myCalculation + 50;
		System.out.println("myAdditionCalc "+ myAdditionCalc);
		
		int multCalc = myAdditionCalc * 30;
		System.out.println("My Final Result is =" + multCalc);

	}
	
	
	
}
