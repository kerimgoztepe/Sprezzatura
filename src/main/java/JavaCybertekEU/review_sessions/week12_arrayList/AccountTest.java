package review_sessions.week12_arrayList;

public class AccountTest {

	public static void main(String[] args) {
		
		//Array of Objects
		//Unlike a traditional array that store values like string, integer, boolean
		//array objects stores Objects. The array elements store the location of the
		//reference variables of the object
		
		Account obj[] = new Account[2];
		obj[0] = new Account();
		obj[1] = new Account();
		
		obj[0].setData(1, 2);
		obj[1].setData(3, 4);
		
		System.out.println("For Array Element 0");
		obj[0].showData();
		
		System.out.println("For Array Element 1");
		obj[1].showData();
		

	}

}
