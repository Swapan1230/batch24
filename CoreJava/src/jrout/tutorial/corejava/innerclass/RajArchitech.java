package jrout.tutorial.corejava.innerclass;

public class RajArchitech {
	
	public void createBedRoom(){
		System.out.println("I am creating my own bed room...");
		JayArchitect jarc = new JayArchitect();
		
//		JayArchitect.BedRoom br = new JayArchitect().new BedRoom();
		JayArchitect.BedRoom br = jarc.new BedRoom();
		
		br.create();
	}
}	// JayArchitect$BedRoom
