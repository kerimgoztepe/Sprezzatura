package review_sessions.week7_controlFlowStatements_Methods;

public class VoidMethodsPractice {

	public static void main(String[] args) {
		
        //Call checkEligible
        checkEligible(641);
        
        printDay(1);
        printDay(2);
		
		

	}
	
    public static void checkEligible(int creditScore){
        if (creditScore >= 640){
            System.out.println("Congratulations, You are eligible for this loan");
        }else{
            System.out.println("Sorry, you are not eligible for this loan");
        }
    }
    
    public static void printDay(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day - Java Day!");
        }
    }

}
