package jrout.tutorial.corejava.inheritance.abstractexample;

public class ElephantAfrican extends Elephant{
	
	public ElephantAfrican(String name) {
		super(name);
	}
	
	@Override
	public void makesNoise() {
		System.out.println("It makes UUUUUUUUUUUUUUXXXXXXXX");
	}

	@Override
	public void minTrunkSize() {
		// TODO Auto-generated method stub
		
	}
}
