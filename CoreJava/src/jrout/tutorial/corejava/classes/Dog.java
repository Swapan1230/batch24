package jrout.tutorial.corejava.classes;

public class Dog {
	private String name;
	private String breed;
	
	public static int dogCount;
	static {
		System.out.println("This is first line in dog..");
	}
	
	public Dog(String name, String breed){
		System.out.println("I am in the constructor...for " + name);
		this.name = name;
		this.breed = breed;
		dogCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public void bark(String noise) {
		int size = noise.length();
		System.out.println("Bark "+ noise + " "+ size);
	}
}
