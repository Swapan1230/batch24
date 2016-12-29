package jrout.tutorial.corejava.classes.function;

public class Calculator {
	String name = "CASIO";
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c= 7;
		int d = 3;
		
		Calculator calc = new Calculator();
		int add = calc.add(a, b);
		
		int sub = calc.sub(c, d);
		
		
//		System.out.println(calc.name); // State
		
//		int div = calc.add(a, b)/calc.sub(c, d);
		int div = add/sub;
		
		System.out.println("Division of the previous calcuation is "+ div);

	}
	
	/**
	 * behaviours
	 * @param a
	 * @param b
	 */
	public int add(int a , int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public int sub(int a , int b){
		System.out.println(a-b);
		return a-b;
	}
	
}
