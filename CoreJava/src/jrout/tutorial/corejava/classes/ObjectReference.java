package jrout.tutorial.corejava.classes;

public class ObjectReference {
	public static void main(String arg[]) {
		Person sheetal = new Person();
		sheetal.age = 17;
		sheetal.name = "Sheetal";
		sheetal.occupation = "Scientist";
		
		System.out.println(sheetal.name);
		sheetal.name = "SheetalOne";
		System.out.println(sheetal.name);
		
		Person sheetalTwo = sheetal;
		
		sheetalTwo.name = "SheetalSame";
		
		System.out.println(sheetal.name);
				
	}
}
