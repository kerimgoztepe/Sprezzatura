package MySampleJavaCodes;

public class FibonacciNum {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sumc = 0;
        for (int i = 0; i<5; i++ ) {
            sumc = a+b;
            a=b;
            b=sumc;

        }
        System.out.println("fibonacci numbers are = "+sumc);



    }
}
