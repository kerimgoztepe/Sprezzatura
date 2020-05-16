package review_sessions.week9_string;

public class String_CharAt {

	public static void main(String[] args) {
		
        String company = "Cybertek";
        System.out.println(company.length());  //8. it starts the count from 1
        System.out.println(company.charAt(0)); //C
        System.out.println(company.charAt(4)); //r
        
        //System.out.println(company.charAt(8)); StringIndexOutOfBoundsException
        
        for(int i=0;i<company.length();i++) {
        	System.out.print(company.charAt(i) + " ");
        }

	}

}
