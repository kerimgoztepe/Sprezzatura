package JavaInterviewQ;

public class ReverseString2 {

    public static void main(String[] args) {
        String str = "Caio ragazzi";
        char reverse[] = str.toCharArray();
        // converted to character array and printed in reverse order
        System.out.println("Before reverse = "+str);
        for(int i= reverse.length-1; i>=0; i--) {

            System.out.print(reverse[i]);
        }
    }

}

/*
Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().

Answer: There are several ways with which you can reverse your string if you are allowed
to use the other string inbuilt functions.

Method 1:

In this method, we are initializing a string variable called str with the value of your given string.
Then, we are converting that string into a character array with the toCharArray() function.
Thereafter, we are using for loop to iterate between each character in reverse order and printing each character.
 */