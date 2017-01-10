package jrout.tutorial.corejava.inheritance.abstractexample;

public class AbstractClient {
	public static void main(String ...arg){
		/*Animal ele = new Elephant("Elephant");
		ele.makesNoise();*/
		
		/*Animal deer = new Deer("Deer");
		deer.makesNoise();
		
		Dog dog = new Dog("Dog");
		dog.makesNoise();
		
		Snack snake = new Snack("Snake");
		snake.makesNoise();
		snake.type();*/
		
		Animal eleAsian = new ElephantAsian("ElephantAsian");
		eleAsian.makesNoise();
		
		Animal eleAfrican = new ElephantAfrican("ElephantAfrican");
		eleAfrican.makesNoise();
		
	}
}
