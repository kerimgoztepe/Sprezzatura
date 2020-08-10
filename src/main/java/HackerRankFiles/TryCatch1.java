package HackerRankFiles;

public class TryCatch1 {

    //Java try and catch
    //The try statement allows you to define a block of code
    // to be tested for errors while it is being executed.
    //
    //The catch statement allows you to define a block of code to be executed,
    // if an error occurs in the try block.

    public static void main(String[ ] args) {
        try {
            int[] arraY = {1, 11, 22, 33, 55};
            System.out.println(arraY[9]);
        } catch (Exception e) {
            System.out.println("There is a problem my friend...Check it please");
        }
    }
}
