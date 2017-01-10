package jrout.tutorial.corejava.inheritance.abstractexample;

public class Toy implements Swimming , Jumping {

	@Override
	public void swim() {
		System.out.println("Toy swims in the same place...");
		
	}

	@Override
	public void jump() {
		System.out.println("This toy jumps very high...");
	}
	
	

}
