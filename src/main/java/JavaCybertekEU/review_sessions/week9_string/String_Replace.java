package review_sessions.week9_string;

public class String_Replace {

	public static void main(String[] args) {
		
        String words = "pascal, unix, python";
        System.out.println(words.replace("pascal","java"));
        
        System.out.println(words);
        
        words = words.replace(", ", "|");
        System.out.println(words);
        
        System.out.println("============");
        
        //ReplaceAll()
        String myString = "   Horse         Cow\n\n   \r Camel \t\t Sheep \n Goat        ";

        String regex = "\\s";
        String replacement = "";

        String newString = myString.replaceAll(regex, replacement); 
        // HorseCowCamelSheepGoat
        System.out.println(newString);
        
        System.out.println("===============");
        
        String amazonResult = "iphone case (212,713 Results)";
        amazonResult = amazonResult.replace("iphone case (","");//212,713 Results)
        amazonResult = amazonResult.replace(",","");//212713 Results)
        amazonResult = amazonResult.replace(" Results)", "");//212713
        
        System.out.println(amazonResult);
        
        

	}

}
