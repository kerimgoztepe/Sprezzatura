package HackerRankFiles;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: FizzBuzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: Buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: Fizz",i);
            }
        }
        System.out.printf("\n");
    }
}
