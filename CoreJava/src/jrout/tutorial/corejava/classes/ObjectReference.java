package jrout.tutorial.corejava.classes;

public class ObjectReference {
	public static void main(String arg[]) {
		/*Person sheetal = new Person();
		sheetal.age = 17;
		sheetal.name = "Sheetal";
		sheetal.occupation = "Scientist";*/
		
		
//		System.out.println(sheetal.name);
//		sheetal.name = "Different Name";
//		ObjectReference or = new ObjectReference();
//		or.changeName(sheetal);
//		System.out.println(sheetal.name);
		
		/*System.out.println(sheetal.name);
		sheetal.name = "SheetalOne";
		System.out.println(sheetal.name);*/
		
		/*Person sheetalTwo = sheetal;
		
		sheetalTwo.name = "SheetalSame";*/
		
//		System.out.println(sheetal.name);
		
		ObjectReference or = new ObjectReference();
//		int a = 40;
//		System.out.println(a);
//		
//		or.changeNumber(a);
//		System.out.println(a);
		
		String name = new String("Jay");
		or.changeString(name);
		System.out.println(name);
		
		Person per = new Person();
		per.name = "Jayram";
		System.out.println(per);
		or.changeName(per);
		System.out.println(per);
	}
	
	public void changeName(Person person) {
		person.name = "Different Name";
	}
	
	public void changeNumber(int a){
		a = 90;
	}
	
	public void changeString(String name) {
		name = "Rajesh";
	}
	
	
	
}
