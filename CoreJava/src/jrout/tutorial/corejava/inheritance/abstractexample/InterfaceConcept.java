package jrout.tutorial.corejava.inheritance.abstractexample;

public class InterfaceConcept {

	public static void main(String[] args) {
		Swimming swim = null;
		
		swim = new ElephantAsian("Asian Elephant");
		
		swimmingDetails(swim);
		
		swim = new Snack("Asian Elephant");
		swimmingDetails(swim);
		
		
		
		Jumping jumpToy = new Toy();
		jumpToy.jump();
		
		Swimming swimi = new Toy();
		swimi.swim();
	}
	
	public static void swimmingDetails(Swimming swim){
		swim.swim();
	}

}
