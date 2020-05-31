package JavaCybertekEU.assignment_EU2.assignment14_krm.Question06;

public class ParkingMeter {
	
	private int timeLeft = 0;
	private int maxTime;
	
	public ParkingMeter (int maxTime) {
		this.maxTime=maxTime;
	}
	
	public int getTimeLeft() {
		return timeLeft;
	}
	
	public boolean add (int x) {
		if(x==25 && (timeLeft+30)<=maxTime) {
			timeLeft+=30;
			return true;
		}
		return false;
	}
	
	public void tick () {
		if (timeLeft>0) {
			timeLeft--;
		}
	}
	
	public boolean isExpired () {
		if (timeLeft==0) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
