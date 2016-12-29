package jrout.tutorial.corejava.classes.function;

import jrout.tutorial.corejava.classes.Person;

public class FuncExample {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.age = 21;
		person1.name = "Swetha";
		person1.occupation = "Student";
		
		printPersonDetail(person1);
		
		Person sheetal = new Person();
		sheetal.age = 17;
		sheetal.name = "Sheetal";
		sheetal.occupation = "Scientist";
		printPersonDetail(sheetal); // Method Function API

	}
	/**
	 * This is a method which prints the person details...
	 * @param person
	 */
	public static void printPersonDetail(Person person) {
		System.out.println("Name is "+ person.name);
		System.out.println("Age of "+ person.name +" is :" + person.age);
		System.out.println("Occupation of "+ person.name +" is : "+ person.occupation);
		
		if(person.age > 20) {
			System.out.println("He/She is ready to learn Java...");
			System.out.println("Java is an Object Oriented Language...");
		}
		printExtraInfo(person.age, person.name);
//		printExtraInfo(person);
		System.out.println("\n");
		
		
	}
	
	public static void printExtraInfo(int age,String name){
		if(age > 20) {
			System.out.println(name + " is ready to learn Java... ");
			System.out.println("Java is an Object Oriented Language...");
		}else {
			System.out.println(name +" cannot learn java....");
		}
	}
	
	public static void printExtraInfo(Person person){
		if(person.age > 20) {
			System.out.println(person.name + " is ready to learn Java...and occupation is "+ person.occupation);
			System.out.println("Java is an Object Oriented Language...");
		}else {
			System.out.println(person.name +" cannot learn java....");
		}
	}
}
