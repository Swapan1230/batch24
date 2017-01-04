package jrout.tutorial.corejava.classes;

public class GarbageCollection {

	public static void main(String[] args) {
		/*
		for(int i = 0 ; i < 2000000; i++){
			new Room(i+"");	
		}*/
		
		Room one = new Room("One");
		Room two = new Room("Two");
		Room three = new Room("Three");
		
		System.out.println(three);
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Value =" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(two);
		
		Room four = new Room("Four");
		System.out.println(one);
	}

}

class Room {
	private String name;
	
	/*public Room(){
		this.name = "Default";
	}*/
	public Room(String name) {
		//System.out.println("Room Is created... = "+ name);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Room Name = "+ name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Room is closed.. " + name);
	}
}