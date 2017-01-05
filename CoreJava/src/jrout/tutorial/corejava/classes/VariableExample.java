package jrout.tutorial.corejava.classes;

import jrout.tutorial.corejava.array.ArrayExample;

public class VariableExample {
	
	/*static {
		System.out.println("Hello I am the first one.. to be invoked...");
	}*/
	public static void main(String[] args) {
		//System.out.println("I am in main method...");
		new Dog("Metto","Lab");
		new Dog("Kitta","Husky");
		
		/*Dog lab = new Dog("Metto","Lab");
		lab.bark("Slow");
		
		Dog husky = new Dog("Kitta","Husky");
		husky.setBreed("New Husky");
		husky.bark("Very Loud");
		
		Dog pom = new Dog("putti","Pom");
		
		System.out.println(Dog.dogCount);
		
		System.out.println(Math.addExact(50,50));
		
		VariableExample ve = new VariableExample();
		ve.callMe("");
		
		VariableExample.callMe("");
		
		ArrayExample ae = null;*/
		
		callMe("");
		
	}

	
	public static void callMe(String name){
//		callMeAgain(); // We cannot call non-static method from static method...
	}
	
	public void callMeAgain(){
		callMe("");
	}
	
}

