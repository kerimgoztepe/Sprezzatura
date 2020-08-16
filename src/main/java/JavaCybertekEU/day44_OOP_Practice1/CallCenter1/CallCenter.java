package JavaCybertekEU.day44_OOP_Practice1.CallCenter1;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp wa = new WhatsApp();
        wa.launch();
        wa.allOSCompatible = true;
        wa.isFree=true;
        wa.name="WhatsApp";
        wa.call("Ozzy"        );
        wa.sendMessage("thank you");
        wa.videoCall();
        wa.accept();

        VoiceCollable.decline();
        System.out.println(VoiceCollable.CAN_CALL);

        MessagingApp.getCount();
        MessagingApp.setCount(4);

        System.out.println("+++++++++++++++++++++++++++");

        VoiceCollable obj = new WhatsApp(); //polymorphic way
        //obj.launch(); // go to VoiceCallable and find the launch method

        ((MessagingApp) obj).launch();
        ((MessagingApp) obj).allOSCompatible=false;
        obj.call("mr.tom");
        //((WhatsApp)obj).videoCall();



    }


}
