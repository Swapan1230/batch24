package jrout.tutorial.corejava.inheritance.abstractexample;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	@Override
	public void makesNoise() {
		System.out.println("It makes Bhow.....");
	}
}
