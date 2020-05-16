package review_sessions.week11_wrapperClasses_arrayList;

public class CharacterWrapping {

	public static void main(String[] args) {
		
        char ch1 = 'a';
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLowerCase(ch1));
        System.out.println(Character.isAlphabetic(ch1));

        char ch2 = '5';
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isLetterOrDigit(ch2));
        System.out.println(Character.isLetter(ch2));

        char ch3 = '%';
        System.out.println(Character.isDigit(ch3));
        System.out.println(Character.isLetter(ch3));
        System.out.println(Character.isLetterOrDigit(ch3));
        System.out.println(!Character.isLetterOrDigit(ch3));

        char ch4 = ' ';
        System.out.println(Character.isWhitespace(ch4));
        System.out.println(Character.isSpaceChar(ch4));

        String firstName = "John";
        //test if firstname starts with uppercase letter
        if(Character.isUpperCase(firstName.charAt(0))) {
            System.out.println("PASS: firstname starts with uppercase");
        }else{
            System.out.println("FAIL: firstname does not start with uppercase");
        }

	}

}
