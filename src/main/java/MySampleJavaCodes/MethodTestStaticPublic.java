package MySampleJavaCodes;

public class MethodTestStaticPublic {
    public void myNewMethod() {
        System.out.println("Hello man");
    }

    static void myNewMethod2 (){
        System.out.println("Caio Ragazzo");
    }

    public static void main(String[] args) {
        MethodTestStaticPublic newTest = new MethodTestStaticPublic();
        newTest.myNewMethod();
        myNewMethod2();
    }
}
