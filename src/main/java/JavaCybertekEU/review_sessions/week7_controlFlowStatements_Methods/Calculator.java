package review_sessions.week7_controlFlowStatements_Methods;

public class Calculator {

	public static void main(String[] args) {
		
        addNums(5, 3);
        //int sum = addNums(10, 4); //ERROR
        int sum = add(10, 4);

        System.out.println("sum from method : " + sum);
        //System.out.println(66);
        System.out.println( add(44, 22) );
        System.out.println( "result: " + add(44, 22) );
        //call subtract method
        int difference = subtract(44,5);
        System.out.println("44 - 5 is "+difference);
                                           //-900
        System.out.println("99 - 999 is " + subtract(99,999));

    }

    //Method subtract(int num1, int num2)
    public static int subtract(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static void addNums(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result : " + result);
    }

	


}
