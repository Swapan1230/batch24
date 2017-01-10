package jrout.tutorial.corejava.inheritance.abstractexample;

public class Snack extends Animal implements Swimming {

	public Snack(String name) {
		super(name);
	}

	@Override
	public void makesNoise() {
		System.out.println("I make hissing.. noise....");
	}

	@Override
	public void swim() {
		System.out.println("Snacks can swing long distance...");
		
	}

}
