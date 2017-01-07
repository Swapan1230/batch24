package jrout.tutorial.corejava.classes;

import java.util.Scanner;

public class ContructorExample {

	public static void main(String[] args) {
		Employee radhika = new Employee("Radhika");
		radhika.setAge(-1);
		
		
		System.out.println(radhika);
		
		/*
		
		Employee suhash = new Employee("Suhash",101);
		suhash.experience = 5;
		suhash.department = "JAVA";
		System.out.println(suhash);*/
		
		Employee raj = new Employee("Raj",333,"Testing",6,24);
		raj.setAge(-25);
		
		System.out.println(raj);
		
		int bonus = 45;
		
		System.out.println("Total Bonus = " + (bonus+ raj.getAge()));
		
		
	}

}
