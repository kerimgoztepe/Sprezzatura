package HackerRankFiles;
import java.util.Scanner;
public class Scanner1 {

    // Java program to read data of various types using Scanner class.

        public static void main(String[] args) {
            // Declare the object and initialize with
            // predefined standard input object
            Scanner sc = new Scanner(System.in);

            // String input
            String name = sc.nextLine();
            //System.out.println("Enter Name");

            // Character input
            char gender = sc.next().charAt(0);

            // Numerical data input
            // byte, short and float can be read
            // using similar-named functions.
            int age = sc.nextInt();
            long mobileNo = sc.nextLong();
            double cgpa = sc.nextDouble();

            // Print the values to check if the input was correctly obtained.

            System.out.println("Name: "+name);
            //System.out.println("Enter Gender");
            System.out.println("Gender: "+gender);
            //System.out.println("Enter Age");
            System.out.println("Age: "+age);
            //System.out.println("Enter Mobile");
            System.out.println("Mobile Number: "+mobileNo);
            //System.out.println("Enter CGPA");
            System.out.println("CGPA: "+cgpa);
        }
    }


