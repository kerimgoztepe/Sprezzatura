package review_sessions.week8_classObject_scanner;

public class BankAccountsTest {

	public static void main(String[] args) {
		
        //create an account
        CheckingAccount clientOne = new CheckingAccount();
        //set data
        clientOne.accountNumber = 3412873491L;
        clientOne.accountHolder = "Wooden Spoon";
        clientOne.balance = 500.0;

        System.out.println(clientOne.accountNumber);
        //call getAccountInfo method
        clientOne.getAccountInfo();

        //create another account and set data using a method
        CheckingAccount clientTwo = new CheckingAccount();
        clientTwo.setInfo(300.0, 3212445534L, "Donald Trump");
        clientTwo.getAccountInfo();

        //test deposit method
        clientOne.deposit(300);
        clientOne.getAccountInfo();

        clientTwo.deposit(1000);
        clientTwo.getAccountInfo();

        //test withdraw method
        clientOne.withdraw(100);
        clientOne.getAccountInfo();

        clientTwo.withdraw(500);
        clientTwo.getAccountInfo();

        // call purchase method
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setInfo(200, 2221114444L, "Master Muhtar");
        myAccount.purchase("book", 98);
        System.out.println("current balance: " + myAccount.balance);

        myAccount.purchase("shoes", 120.0);
        myAccount.purchase("car tyres", 450);

        //balance is -538
        System.out.println("Coded lots of java, and landed a SDET job");
        System.out.println("First month salary is direct deposited");

        myAccount.deposit(10000);
        myAccount.getAccountInfo();

	}

}
