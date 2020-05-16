package day45_Exception_krm;

public class RunTimeError {
    public static void main(String[] args) {
        go();

    }
    public static void go() {
        System.out.println("going");
        go(); //this cause error..runtime error
    }
}
