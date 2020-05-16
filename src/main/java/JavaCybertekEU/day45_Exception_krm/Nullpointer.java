package day45_Exception_krm;

public class Nullpointer {

    static String name;

    public static void main(String[] args) {
        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e) { //exception e
            System.out.println("nullpointerexception happened");
            e.printStackTrace();
            System.out.println("here is message = " + e.getMessage());

        }
    }
}