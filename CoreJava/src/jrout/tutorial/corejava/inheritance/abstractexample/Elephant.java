package jrout.tutorial.corejava.inheritance.abstractexample;

public abstract class Elephant extends Animal{
	
	public Elephant(String name) {
		super(name);
	}
	
	/*@Override
	public void makesNoise() {
		System.out.println("It makes UUUUUUUUUUUUUU");
	}*/
	
	public abstract void minTrunkSize();
}
