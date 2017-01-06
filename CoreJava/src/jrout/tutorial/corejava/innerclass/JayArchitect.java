package jrout.tutorial.corejava.innerclass;

public class JayArchitect {
	private String name = "Jayram";
	
	public void createBedRoom(){
		System.out.println("I am creating my own bed room...");
		BedRoom br = new BedRoom();
		br.create();
	}
	
	public class BathRoom{
		private String bathTub;
		private String shower;
	}
	
	public class BedRoom {
		
		BathRoom br = new BathRoom();
		public void design(){
			System.out.println("Designing is going on..."+ name);
		}
		
		public void construction(){
			System.out.println("Construction is going on...");
		}
		
		public void painting(){
			System.out.println("Painting going on....");
		}
		
		public void create(){
			design();
			construction();
			painting();
		}
	}
}
