package day44_OOP_fromNet.composition;

public class TestAuthor {

    /**
     * A test driver for the Author class.
     */

        public static void main(String[] args) {
            // Test constructor and toString()
            Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
            Author kerim = new Author("kerim von john", "kerimmm@gmail.com", 'm');
            Author john = new Author("john von limon", "johnmn@yahoo.co.com", 'm');
            System.out.println(ahTeck);  // toString()
            System.out.println(kerim);
            System.out.println(john);

            System.out.println("+++++++++++++++++++++++++++++++++++++++++");


            //Tan Ah Teck (m) at teck@nowhere.com

            // Test Setters and Getters
            // if you want to change e mail with another one, you can use setEmail
            ahTeck.setEmail("teckggg@somewhere.com");
            System.out.println(ahTeck);  // toString()
            //Tan Ah Teck (m) at teck@somewhere.com
            System.out.println("name is: " + ahTeck.getName());
            //name is: Tan Ah Teck
            System.out.println("gender is: " + ahTeck.getGender());
            //gender is: m
            System.out.println("email is: " + ahTeck.getEmail());
            //email is: teck@somewhere.com
            System.out.println(ahTeck);  // toString()
            //Tan Ah Teck (m) at teck@somewhere.com
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("name is: " + john.getName());
            //name is: Tan Ah Teck
            System.out.println("gender is: " + john.getEmail());
            //gender is: m
            System.out.println("email is: " + john.getGender());
            //email is: teck@somewhere.com
        }
    }

