package jrout.tutorial.corejava.enums;

public class EnumClient {

	public static void main(String[] args) {
		
		EnumClient ec = new EnumClient();
		ec.printMonth(Months.FEB);
	}
	
	public void printMonth(int monthVal) {
		if(monthVal == 1) {
			System.out.println("This is JAN");
		}else if(monthVal == 2){
			System.out.println("This is FEB");
		}else if(monthVal == 3){
			System.out.println("This is MAR");
		}
	}
	
	public void printMonth(Months month) {
		if(Months.JAN == month) {
			System.out.println("This is JAN " + month);
		}else if(Months.FEB == month){
			System.out.println("This is FEB "+ month.getValue());
		}else if(Months.MAR == month){
			System.out.println("This is MAR "+ month);
		}
	}
}

/*class  Months {
	public final static int JAN = 1;
	public final static int FEB = 2;
	public final static int MAR = 3;
}*/

enum Months {
	JAN(0),FEB(1),MAR(2),APR(3);
	
	int val;
	Months(int val) {
		this.val = val;
	}
	
	public int getValue(){
		return this.val;
	}
	
}


enum Coffee {
	SMALL,MEDIUM,LARGE
}



/*
public class EnumTest {
    Day day;
    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}*/