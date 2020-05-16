package review_sessions.week9_string;

public class String_Substring {

	public static void main(String[] args) {
		
        String word = "java is fun";
        //print java
        System.out.println( word.substring(0,4) );
        //print is
        System.out.println(word.substring(5,7));
        //print fun
        System.out.println(word.substring(8,11));

        System.out.println(word.substring(8));//start at 8 until end
        
       System.out.println(word.substring(3,3));
        
        System.out.println("==============");
        
        //How to get a particular substring
        
        String s1 = "the best Java Core course in Europe is Cybertek. End of story";
        String myTarget = "Europe";
        
        int index1 = s1.indexOf(myTarget);
        int index2 = index1 + myTarget.length();
        
        System.out.println(s1.substring(index1,index2));
        
        System.out.println("==============");
        
        //How to find all substrings of a given string
        
        String s2 = "Cybertek";
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 1; j <= s2.length(); j++) {
                System.out.println(s2.substring(i, j));
            }
        }
        
        
        

	}

}
