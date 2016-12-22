package jrout.tutorial.corejava.array;

public class TwoDimension {

	public static void main(String[] args) {
		int age1 = 12; int height1 = 5;
		int age2 = 23; int height2 = 3; // Access this
		int age3 = 45; int height3 = 5;
		int age4 = 45; int height4 = 5;
		
		
		//int ages[] = {age1,age2};
		int ageHeight1[] = {age1,height1 , 89};
		int ageHeight2[] = {age2,height2};
		
		int agesHeights [][] = {ageHeight1, ageHeight2, {age3,height3} , {age4,height4}};
		
		//System.out.println(agesHeights[1][0] + " Height = "+ agesHeights[1][1]);
		
		for(int i = 0 , k =0 ; i < agesHeights.length  ; i++) {
			for(int j=0 ; j < agesHeights[i].length; j++ ) {
				System.out.print(agesHeights[i][j] +" ");
			}
			System.out.println("");
		}
		
		
	}
	
	
}
