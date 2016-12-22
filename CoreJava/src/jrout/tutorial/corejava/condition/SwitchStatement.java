package jrout.tutorial.corejava.condition;

public class SwitchStatement {

	public static void main(String[] args) {
		int ages[]  = {0,1,2,3,4};
		
		/*for(int i = 0 ;i < ages.length; i++) {
			System.out.println("["+i+"]");
			if(i == 0) {
				System.out.println("Zero Value");
			}else if(i == 1){
				System.out.println("One Value");
			}else if(i == 2){
				System.out.println("Two Value");
			}else if(i == 3){
				System.out.println("Three Value");
			}else if(i == 4){
				System.out.println("Four Cards");
			}
		}*/
		
		for(int i = 0 ;i < ages.length; i++) {
			System.out.println("["+i+"]");
			switch (i) {
			case 0:
				System.out.println("Zero Value");
				break;
			case 1:
				System.out.println("One Value");
				break;
			case 2:
				System.out.println("Two Value");
				break;
			case 3:
				System.out.println("Three Value");
				break;
			default:
				System.out.println("No Values found... for "+ i);
				break;
			}
		}
	}

}
