package review_sessions.week9_string;

public class StringPool {

	public static void main(String[] args) {
		
        String word1 = "java"; //string pool
        String word2 = "java"; //string pool, re-use
        String word3 = new String("java");//outside pool, in heap

        System.out.println(word1 == word2);//true. both are pointing to same object in pool

        System.out.println(word1 == word3);//false
        //false. because word1 and word3 are poiting to different object in heap.
        //when we use ==, it does not check if values are matching.
        //it only checks if variables are pointing to same object in memory.

        String word4 = new String("java");//outside pool. in heap
        //check if word3 and word4 are point to same object
        System.out.println(word3 == word4);//false. different objects in memory

        String word5 = word4;//point to same object as word4

        System.out.println(word5 == word4);//true. they point to same object in heap

        System.out.println(word1 == word4);//false. different objects in memory
        System.out.println(word1.equals(word4));//true. values match "java"

        String str = "macbook";//string pool in HEAP
       // String str2 = "macbook";//re-use "macbook" in pool
        String str3 = str;//point to same object as str
        
       
        
        

	}

}
