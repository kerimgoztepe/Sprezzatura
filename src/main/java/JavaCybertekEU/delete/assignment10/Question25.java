package delete.assignment10;

public class Question25 {

	public static void main(String[] args) {
		
		System.out.println(mergeStrings("wooden", "spoon"));


	}
	
	  public static String mergeStrings(String one, String two) {
		    
		  String result = "";

		  for (int i=0; i<one.length() || i<two.length(); i++) {
			  if (i < one.length()) {
				  result = result+one.charAt(i);
			  }

		      if (i < two.length()) {
		    	  result = result+two.charAt(i);
		      }
		  }

		  return result;

	  }

}
