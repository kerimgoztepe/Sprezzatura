package review_sessions.week9_string;

public class String_IndexOf {

	public static void main(String[] args) {
		
        String word = "github";

        System.out.println(word.indexOf("g"));//0
        System.out.println(word.indexOf("b"));//5
        System.out.println(word.indexOf("th"));//2
        System.out.println(word.indexOf("tb"));//-1
        
        System.out.println("===========");
        
        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));
        
        // how can I check if "c++" is in the technologies String.
        
        if(technologies.contains("c++")){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not present");
        }
        
        if(technologies.indexOf("c++") > -1){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not present");
        }

        System.out.println("================");
        
        int firstComma = technologies.indexOf(",");
        System.out.println("firstComma = " + firstComma);

        //find the last comma in the String
        int lastComma = technologies.lastIndexOf(",");
        System.out.println("lastComma = " + lastComma);
        
        System.out.println("================");
        
      //How to find second, or third comma?!!
      //"java,c++,python,tomcat,aws"
        
        System.out.println(technologies.indexOf(",",5 )); 
        
        int secondComma = technologies.indexOf(",",5);
        System.out.println("secondComma = " + secondComma);
        //find third comma
        System.out.println(technologies.indexOf("," , secondComma+1));
        

	}

}
