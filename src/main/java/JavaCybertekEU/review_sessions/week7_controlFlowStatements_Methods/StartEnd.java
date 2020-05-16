package review_sessions.week7_controlFlowStatements_Methods;

public class StartEnd {

	public static void main(String[] args) {
		
        int start = 6;
        int end = 13;

        for (int n = start; n <= end; n++){
            System.out.print(n + " ");
        }
        System.out.println();

        //print 10 to 0
        for(int n = 10; n >= 0; n--){
            System.out.print(n +" ");
        }

        System.out.println();
        
        /*
        if start is less than end:
           print all the numbers between start and end
        if start is bigger than end
            print all the numbers from end to start in reverse
        ex:
          start = 5
          end = 8;
          5 6 7 8
          start = 10
          end = 6;
          10 9 8 7 6
         */
        
        start = 14;
        end = 10;
        
        if(start < end){
            for(int n = start; n <= end; n++){
                System.out.print(n+" ");
            }
        }else{         //25         20
            for(int n = start; n >= end; n--){
                System.out.print(n+" ");
            }
        }

	}

}
