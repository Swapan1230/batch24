package jrout.tutorial.corejava.condition;

public class IfElseExample {
	public static void main(String[] args) {
		
		// java IfElseExample JAVA
		int age1 = 34;
		int age2 = 34;
		System.out.println(age1 == age2);
		
		boolean isJavaClass = ("JAVA" == "JAVA");
		
		
		String message = isJavaClass ? "This is java class" : "This is not java class";
		
		/*if (isJavaClass) {
			message = "This is java class";
			message += " This is my first java class";
		} else {
			message = "This is not java class";
		}*/		
		System.out.println(message);
//		
		
		
	}
}