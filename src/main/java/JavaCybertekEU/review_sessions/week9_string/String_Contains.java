package review_sessions.week9_string;

public class String_Contains {

	public static void main(String[] args) {
		
		String str = "Amazon website";
		
		System.out.println(str.contains("Amazon"));
		
		if(str.contains("web")) {
			System.out.println("There is web in the string");
		}else {
			System.out.println("There is no web in the string");
		}
		
		System.out.println("===============");
		
        String email = "employee@yahoo.com";

        if(email.contains("@gmail")){
            System.out.println("Google Account");
        }else if(email.contains("@yahoo")){
            System.out.println("Yahoo account");
        }else if(email.contains("@hotmail")){
            System.out.println("Hotmail account");
        }else if(email.contains("@icloud")){
            System.out.println("Apple account");
        }else{
            System.out.println("Some other account");
        }
        
        System.out.println("===============");
        
        String title = "Porsche HOME - Porsche USA";
        if(title.contains("Porsche")) {
        	System.out.println("Test passed. Correct title");
        }else {
        	System.out.println("test failed. Wrong title");
        }

	}

}
