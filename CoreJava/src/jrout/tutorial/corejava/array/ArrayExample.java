package jrout.tutorial.corejava.array;

public class ArrayExample {

	public static void main(String[] args) {
		
		String name;
		
		name = "Jyotsna";
		
		int age1 = 12;
		int age2 = 23;
		int age3 = 45;
		int age4 = 45;
		
		
		float mathMark = 45.5f;
		float scienceMark = 42.5f;
		float economyMark = 47.5f;
		
		int ages[]  = {age1, age2,age3,40,30,78}; // creation and initialization
		System.out.println("Printing Ages===="+ ages.length);
		calcualte(ages);
//		for(int i =0 ; i < ages.length ; i++) {
//			System.out.println("ages["+i+"]"  +  "  " + ages[i]);
//		}
		
		//System.out.println(ages[1]);
		
		float marks[] = new float[5]; // only creation
		
		marks[0] = mathMark;
		marks[1] = scienceMark;
		marks[2] = economyMark;
		
		System.out.println("Printing Marks====");
		for(int i =0 ; i < marks.length ; i++) {
			System.out.println(i  +  "  " + marks[i]);
		}
		//System.out.println(marks[2]);
		
		//int i[] = new int[10];
		//int j[] = {1,2,3,4,5,6,7,8};

		

	}
	
	public static void calcualte(int ages[]) {
		for(int i =0 ; i < ages.length ; i++) {
			System.out.println("ages["+i+"]"  +  "  " + ages[i]);
		}
	}
	
	public void hello(){
		
	}
	

}
