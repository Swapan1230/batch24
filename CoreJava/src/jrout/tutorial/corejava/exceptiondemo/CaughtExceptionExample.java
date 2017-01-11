package jrout.tutorial.corejava.exceptiondemo;

import java.util.Scanner;

public class CaughtExceptionExample {

	public static void main(String[] args) {
		CaughtExceptionExample cee = new CaughtExceptionExample();
		
		int age[] = {3,4,5,6,7,8,91,23,67};
		int input = 0;
		
		int myCalculation = 0;
		try {
			myCalculation = cee.calcDiv(input);
		} catch (UserDefinedInputException e) {
			e.printStackTrace();
		}
		int ageFromArray = 0;
		try{
			ageFromArray = age[myCalculation];
			
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
	
	public int calcDiv(int input) throws UserDefinedInputException {
		
		if(input == 0) {
			throw new UserDefinedInputException("Please Enter Values More than Zero");
		}
		return 10 /input;
	}
	
}
