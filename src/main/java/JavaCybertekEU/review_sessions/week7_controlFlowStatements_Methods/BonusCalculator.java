package review_sessions.week7_controlFlowStatements_Methods;

public class BonusCalculator {

	public static void main(String[] args) {
		
        double salary = 1000.0;
        double sales = 1200.4;
        int bonus = 0;

        if(sales >= 10000.0){
            bonus += 500; //bonus = bonus + 500;
            salary += bonus; //salary=salary+bonus;
        }else {
            bonus += 50;
            salary += bonus;
        }
        //Your total salary is $1500 and bonus is $500
        System.out.println("Your total salary is $"+salary+" and it includes bonus of $"+bonus);

	}

}
