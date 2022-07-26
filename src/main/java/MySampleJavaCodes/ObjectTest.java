package MySampleJavaCodes;

public class ObjectTest {

    int x = 5;
    String y = "Object test";

    public static void main(String[] args) {
        ObjectTest myObj = new ObjectTest();
        ObjectTest myObj2 = new ObjectTest();
        System.out.println(myObj.x);
        System.out.println(myObj2.y);
        System.out.println(myObj.y);

        myObj.x = 40;
        System.out.println(myObj.x);
        System.out.println();
    }


}
