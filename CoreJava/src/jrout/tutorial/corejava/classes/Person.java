package jrout.tutorial.corejava.classes;

public class Person {
	public int age; // Premitive
	public String name;
	public String occupation;
	
	public Dog dog; // HAS-A Relationship
	public Address address;
	
	@Override
	public String toString() {
		return name;
	}
}	

class Address{
	String add1;
	String add2;
}