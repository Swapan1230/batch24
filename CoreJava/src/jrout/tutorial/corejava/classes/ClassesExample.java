package jrout.tutorial.corejava.classes;

public class ClassesExample {

	public static void main(String[] args) {
		
		int age = 12;
		
		
		
		Person person1 = new Person();
		person1.age = 18;
		person1.name = "Swetha";
		person1.occupation = "Student";
		
		Person sheetal = new Person();
		sheetal.age = 17;
		sheetal.name = "Sheetal";
		sheetal.occupation = "Scientist";
		
		System.out.println(person1.name + " " + person1.age +" " + person1.occupation);
		System.out.println(sheetal.name + " " + sheetal.age +" " + sheetal.occupation);
		
		sheetal.name = "SheetalOne";
		
		System.out.println("\n");
		System.out.println(person1.name + " " + person1.age +" " + person1.occupation);
		System.out.println(sheetal.name + " " + sheetal.age +" " + sheetal.occupation);
		
		
		Person hanirutha = new Person();
		hanirutha.name = "Hanirutha";
		
		System.out.println(hanirutha.age);
		System.out.println(hanirutha.name);
		System.out.println(hanirutha.occupation);
		
		
		hanirutha.name = null;
		System.out.println(hanirutha.name);
		
		
		
		
		
		
		
	}

}
