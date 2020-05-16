package day44_OOP_Practice1.CallCenter1;

public interface VoiceCollable {


    boolean CAN_CALL = true;
    void call(String contact); // public abstract void call(String abstract is aloso true

    //static method
    public static void decline() {
        System.out.println("mike declined voice call");
    }
    //default method
    public default void accept(){
        System.out.println("mike finaly accepted voice call");

    }

}
