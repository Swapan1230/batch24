package jrout.tutorial.corejava.classes.function;

public class CalcClient {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 4);
		calc.sub(6, 3);
		System.out.println(calc.name); // State
	}

}
