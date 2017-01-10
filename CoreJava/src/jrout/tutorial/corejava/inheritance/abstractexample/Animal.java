package jrout.tutorial.corejava.inheritance.abstractexample;

public abstract class Animal {
	public String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public abstract void makesNoise();
	
	public void type(){
		System.out.println("Type is Animal");
	}
	
	/*public void swim(){
		System.out.println("It swims...");
	}*/
}
