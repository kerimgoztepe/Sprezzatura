package day36_staticClassMembers;

public class Countable {
	
	static int instanceCount; //static variables 

	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
	

}
