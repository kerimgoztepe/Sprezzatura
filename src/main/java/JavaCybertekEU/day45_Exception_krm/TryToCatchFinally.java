package day45_Exception_krm;

public class TryToCatchFinally {
    public static void main(String[] args) {
        String str = "Selenium";
        try {
            System.out.println(str.length());
            System.out.println(str.charAt(100));
        }catch (Exception e) {
            System.out.println("enter correct index");
            return;  //bunu yazinca finally i calisip bitiyor
        }finally {
            System.out.println("finally block");
        }
        System.out.println("Bye...!");
    }
}
