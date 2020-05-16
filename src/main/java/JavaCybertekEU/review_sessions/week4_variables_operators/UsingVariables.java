package review_sessions.week4_variables_operators;

public class UsingVariables {

	public static void main(String[] args) {
		
        int num1, num2, num3;
        num1 = 100;
        num2 = num1; //copy 100 and assign to num2
        num3 = num2;

        System.out.println(num1);//100
        System.out.println(num2);//100
        System.out.println(num3);//100

        num1 = 500;
        System.out.println(num1);//500
        System.out.println(num2);//100
        System.out.println(num3);//100

	}

}
