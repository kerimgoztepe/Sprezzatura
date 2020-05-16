package day35_encapsulation;

public class Person {
	
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


	//instance variables 
	private String name;
	private int age;   //how i can restrict this accesss?
	private  char gender;
	
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public char getGender() {
		return gender;
	}


	



	
	

	
	
	
	
	


		
}

//Encapsulation
//Hide the data
//	- private
//  - public setter method
//  - public getter method 