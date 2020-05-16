package day41_abstractClass;

public abstract class Bird extends Animal {
	
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println("Eating");
	}
	
	/*
	@Override
	public void breathe() {
		
	}
	*/
	
	public abstract void fly();

}
