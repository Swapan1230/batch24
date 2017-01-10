package jrout.tutorial.corejava.inheritance.abstractexample;

public class Deer extends Animal {

	public Deer(String name) {
		super(name);
		
	}
	
	@Override
	public void makesNoise() {
		System.out.println("It makes KKKKKK-- DEER");
	}
}
