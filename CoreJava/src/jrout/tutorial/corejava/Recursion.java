package jrout.tutorial.corejava;

public class Recursion {

	public static void main(String[] args) {
		// fact 4 = 4*3*2*1
		Recursion fact = new Recursion();
		System.out.println(fact.fact(3));
			// 3* 2 * 1
	}

	public int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
	
	
}


// Ctrl+Shift + O : Organizing import
//Ctrl+Shift + R : Searchiing a file in eclipse
// Ctrl+Shift + T : Open up a class
// Ctrl+Shift + F : Fomatting your code..


