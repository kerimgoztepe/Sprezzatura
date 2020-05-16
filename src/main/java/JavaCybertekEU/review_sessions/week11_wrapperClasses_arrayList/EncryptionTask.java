package review_sessions.week11_wrapperClasses_arrayList;

public class EncryptionTask {

	public static void main(String[] args) {
		
		System.out.println(encryped("java"));
		System.out.println(encryped("cybertek"));

	}
	
	
	//create a method that accepts a string and return encryted string
    String alphabet = "abcdefghijklmnopqrstuvwxyz ";
    String encrypted ="zyxwvutsrqponmlkjihgfedcba ";
    
    //java - qzez
    
    public static String encryped(String word) {
    	
    	String decryptedWord = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        String encrypted ="zyxwvutsrqponmlkjihgfedcba ";
        
        for (int i = 0; i < word.length(); i++) {
            //1.  read a letter from word3 - index i and store into myLetter
            char myLetter = word.charAt(i);
            //2. find the position/index of myLetter in encrypted and save into iidx
            int iidx = alphabet.indexOf(myLetter);
            //3.  Read the letter at position iidx from alphabet. and store into char
            char dec = encrypted.charAt(iidx);
            //4. add the dec value into
            decryptedWord += dec;
        }
        
        return decryptedWord;
    	
    	
    	
    }
	

}
