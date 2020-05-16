package assignment_EU2.assignment10_mix;

public class Question27 {

	public static void main(String[] args) {

	    System.out.println(coverString("java methods", "me") ) ; 
	    
	}
	  
	public static String coverString(String main, String coverME) {
	    
		String replace = "[" + coverME + "]";
		String result = "";

		for (int i = 0; i < main.length() - coverME.length(); i++) {
			if (main.startsWith(coverME, i)) {
				result = main.replace(coverME, replace);
			}

			if(!main.contains(coverME)){
				result="["+main+"]";
			}
		}

		return result;
		
	}

}
