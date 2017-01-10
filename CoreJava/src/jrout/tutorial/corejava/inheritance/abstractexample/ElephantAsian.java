package jrout.tutorial.corejava.inheritance.abstractexample;

public class ElephantAsian extends Elephant implements Swimming {
	 
	public ElephantAsian(String name) {
		super(name);
	}
	
	@Override
	public void makesNoise() {
		System.out.println("It makes UUUU");
	}

	@Override
	public void minTrunkSize() {
		
	}

	@Override
	public void swim() {
		System.out.println("Asian Elephant can swim..short distance...");
		
	}
}
