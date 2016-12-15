package jrout.tutorial.corejava.operator;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int rajAge = 40;
		int samAge = 50;
		
		int jyotsnaAge = 18;
		int renuAge = 19;
		
		int jHeight = 5;
		int rHeight = 6;
		
		int jMark = 70;
		int rMark = 85;
		
		System.out.println(jHeight != rHeight);
		
		boolean isJyotsnaQualified = (jyotsnaAge >=18) ;
		System.out.println(isJyotsnaQualified);
		
		boolean isRenuQualified = (renuAge >=19) ;
		System.out.println(isRenuQualified);
		
		boolean isJRMarkMoreThan75 = jMark > 75 && rMark > 75;
//		boolean isJRQualified = (jyotsnaAge >=18) && (renuAge >=18);
		
//		boolean isJRQualified = isJyotsnaQualified && isRenuQualified && isJRMarkMoreThan75;
		
		boolean isJRQualified = (isJyotsnaQualified && isRenuQualified) || (isJRMarkMoreThan75);
		
		if(isJRQualified) {
			System.out.println("Both Jyotsna and Renu are qualified for Volleball match");
		}else {
			System.out.println("Sorry Both of you ..are are not qualified....");
		}
		
//		System.out.println("isJRQualified "+isJRQualified);
		//System.out.println(" rajAge == samAge"+ (rajAge == samAge));
		//System.out.println(" rajAge < samAge " + (rajAge < samAge));
		
//		System.out.println(" jyotsnaAge < renuAge " + (jyotsnaAge <= renuAge));
		
		
		
		//boolean isQualifiedForVolleyBall  
	}

}
