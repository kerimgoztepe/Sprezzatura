package JavaInterviewQ;

public class ReverseString1 {
    public static void main(String[] args) {
        String word = "Passeggiare";
        StringBuilder word1 = new StringBuilder();
        word1.append(word);
        word1 = word1.reverse();
        System.out.println("Before reverse = "+word);
        System.out.println("After reverse = "+word1);

    }
}
/*
Q #1) Write a Java Program to reverse a string without using String inbuilt function.

Answer: Here, we are initializing a string variable str and making use of the string builder class.

The object of the string builder class str2 will be further used to append
the value stored in the string variable str.
Thereafter, we are using the inbuilt function of the string builder (reverse())
and storing the new reversed string in str2. Finally, we are printing str2.
 */
