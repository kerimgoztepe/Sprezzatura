package day44_oop_practice.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable {

	@Override
	public void videoCall() {
		System.out.println("WhatsApp - doing a video call Mr Mike...");
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - calling " + contact + "...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("WhatsApp - sedingn a message - " + msg + "...");
	}

	/*
	@Override
	public void accept() {
		
	}
	*/
	
	

}
