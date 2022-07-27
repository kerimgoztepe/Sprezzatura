package JavaCybertekEU.day34_constructors_passingObjectToMethod;


/*
 * 
 * Write a class with the name Calculator. 
 * The class needs two fields (instance variables) 
 * with name floor of type Floor and carpet of type Carpet.The class needs to have one constructor 
 * with parameters floor of type Floor and carpet of type Carpet andit needs to initialize the fields.
 * 
 * Write the following methods (instance methods):
*  Method named getTotalCost without any parameters, 
*  it needs to return the calculated total cost to cover the floorwith a carpet.
 */


public class Calculator {
	

	day34_constructors_passingObjectToMethod.Floor floor;
	day34_constructors_passingObjectToMethod.Carpet carpet;
	
	
	public Calculator(day34_constructors_passingObjectToMethod.Floor floor, day34_constructors_passingObjectToMethod.Carpet carpet) { // Floor floor = new floor()
		this.floor = floor;
		this.carpet = carpet;
	}
	
	
	public double getTotalCost() {
		
		return floor.getArea() * carpet.getcost();
	}
	
	
	

}
