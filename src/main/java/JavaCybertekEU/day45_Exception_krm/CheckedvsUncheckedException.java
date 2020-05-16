package day45_Exception_krm;

public class CheckedvsUncheckedException {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000);  //import exception
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
