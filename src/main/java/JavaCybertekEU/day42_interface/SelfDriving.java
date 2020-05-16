package day42_interface;

public interface SelfDriving {
	
	public abstract void selfDrive();
	
	public default void drive() {
		System.out.println("Hello");
	}

}
