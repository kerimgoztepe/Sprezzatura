package day41_abstractClass;

public class Dog extends Animal {
	
	public Dog() {
		super("Name");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	@Override
	public void breathe() {
		System.out.println("Dog is brrathing");
	}

}
