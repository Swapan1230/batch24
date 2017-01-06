package jrout.tutorial.corejava;

public class StringExamples {

	public static void main(String[] args) {
		
		String name1 = "Testing"; //new String("Testing");//"Testing";
		String name2 = "Testing";//new String("Testing");

		
		System.out.println(name1 == name2);

		System.out.println(name1.equals(name2));
		
		
		String name3 = name1+" Me";
		
		System.out.println(name3);
		
		/*int age[] = {1,2,3,4,5,6,6,7,87,90};
		String ageStr = "";
		for(int i = 0 ; i < age.length ; i++) {
			ageStr += i+"-";
		}
		
		System.out.println(ageStr);*/
		
		int age[] = {1,2,3,4,5,6,6,7,87,90};
//		StringBuffer ageStr = new StringBuffer();
		StringBuilder ageStr = new StringBuilder();
		for(int i = 0 ; i < age.length ; i++) {
			ageStr.append(i+"-");
		}
		
		System.out.println(ageStr);
		
	}

}
