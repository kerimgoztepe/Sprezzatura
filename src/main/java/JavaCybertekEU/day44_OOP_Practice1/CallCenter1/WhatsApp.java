package day44_OOP_Practice1.CallCenter1;

public class WhatsApp extends MessagingApp implements VoiceCollable,VideoCallable {

    @Override
    public void videoCall() {
        System.out.println("whatsapp -doing a video call mr mike...");
    }

    @Override
    public void call(String contact) {
        System.out.println("whatsapp - calling " + contact + ".......");
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("whatsapp -sending a message " + msg + "......");
    }

}
