package review_sessions.week7_controlFlowStatements_Methods;

public class DoWhileLoop {

	public static void main(String[] args) {
		
        //print 0 - 10 using do while loop
        int n = 0;
        do{
            System.out.println(n);
            n++;
        }while(n <= 10);

        //print 0 - 100. every other number
        //0 2 4 6 8 10
        int n2 = 0;
        do{
            System.out.print(n2+" ");
            n2+=2;
        }while(n2<=100);

	}

}
