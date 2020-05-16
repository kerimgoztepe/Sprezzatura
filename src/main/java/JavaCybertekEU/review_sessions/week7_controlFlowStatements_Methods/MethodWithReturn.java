package review_sessions.week7_controlFlowStatements_Methods;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		System.out.println( getName() );
		
        String myName=getName();
        System.out.println("myName = " + myName);
        
        //call giveMe5Dollars method
        int wallet = giveMe5Dollars();
        System.out.println("How much in wallet? - $" + wallet);
        
        System.out.println(giveMe5Dollars());
        
       
       // System.out.println(fiveDollars()); will not work, since it is void
       // int numm = fiveDollars();
        

	}
	
    public static void fiveDollars(){
        int dollars = 5;
    }

    public static int giveMe5Dollars(){
        int dollar = 5;
        return dollar;
    }

    public static String getName(){
        return "John";
    }

}
