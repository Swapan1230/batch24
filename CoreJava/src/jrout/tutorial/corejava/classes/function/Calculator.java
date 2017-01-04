package jrout.tutorial.corejava.classes.function;

public class Calculator {
	String name = "CASIO";
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c= 7;
		int d = 3;
		
		Calculator calc = new Calculator();
//		int add = calc.add(a, b);
		int add = calc.add(a, b, c);
		
//		int sub = calc.sub(c, d);
//		calc.printFinalResult(add, sub);
		System.out.println(add);
		
		
	}
	
	public void printFinalResult(int val1 , int val2){
		int div = val1/val2;
		System.out.println("Division of the previous calcuation is "+ div);
	}
	/**
	 * behaviours
	 * @param a
	 * @param b
	 */
	public int add(int a , int b) {
		//System.out.println(a+b);
		return a+b;
	}
	
	public int sub(int a , int b){
		System.out.println(a-b);
		return a-b;
	}
	
	public int add(int a , int b, int c) {
//		return a+b+c;
		return this.add(a,b)+c;
	}
	
	
}
