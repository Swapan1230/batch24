package jrout.tutorial.corejava.classes;

public class NullReferenceExample {
	public static void main(String arg[]) {
		Person sheetal = new Person();
		sheetal.age = 17;
		sheetal.name = "Sheetal";
		sheetal.occupation = "Scientist";
		
//		System.out.println(sheetal.name + " " + sheetal.age +" " + sheetal.occupation);
		
		
		System.out.println(sheetal);
		
//		sheetal = null;
		
		System.out.println(sheetal);
		
		
		System.out.println(sheetal.name);
		
		
		Person per = null;
		System.out.println(per.age);
	}
}
