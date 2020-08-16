package JavaCybertekEU.day44_OOP_Practice1.CallCenter1;

public abstract class MessagingApp {

    public String name;      //variable
    protected boolean isFree;  //this is protected
    boolean allOSCompatible;  //variable boolean
    private static int count;
    public static final String APP_TYPE = "zoom";

    public MessagingApp() {
        System.out.println("messagingApp no-args constructor");
    }

    public MessagingApp(String name, int count) {
        this.name=name;
        MessagingApp.count =count;
    }
    public abstract void sendMessage(String msg);

    public static void close() {
        System.out.println("Messaging app is closing");

    }

    public void launch() {
        System.out.println("Messaging app is launching");
    }

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        MessagingApp.count=count;

    }

}