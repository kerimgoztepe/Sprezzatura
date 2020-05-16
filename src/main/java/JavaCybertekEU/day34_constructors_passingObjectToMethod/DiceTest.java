package day34_constructors_passingObjectToMethod;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Dice sixDice = new Dice(SIX_SIDES);
		Dice twentyDice = new Dice(TWENTY_SIDES);
		
		rollDice(sixDice);
		rollDice(twentyDice);
		
		

	}
	
	
	public static void rollDice(Dice d) {
		
		
		System.out.println("Rolling a " + d.getSides() + " sided dice");  //rolling a 6 sided dice
		
		System.out.println("The dice's value: " + d.getValue() ); //The dice's value : 5
		
	}

}
