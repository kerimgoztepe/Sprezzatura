package review_sessions.week8_classObject_scanner;

public class CheckingAccount {
	
    double balance;
    long accountNumber;
    String accountHolder;
    String type = "checking";//set checking as default value

//  EX: clientTwo.setInfo(300.0, 3212445534L, "Donald Trump");
    public void setInfo(double pBalance, long pAccNumber, String pAccHolder){
        System.out.println("Setting account info...");
        balance = pBalance;
        accountNumber = pAccNumber;
        accountHolder = pAccHolder;
    }

    public void getAccountInfo(){
        System.out.println("Checking Account: $"+balance+","+
                accountNumber+","+accountHolder);
    }
    // account.deposit(450.0);
    public void deposit(double amount){
        System.out.println("depositing $"+amount +" to account number: " + accountNumber);
        balance += amount;
    }

    public void withdraw(double amount){
        System.out.println("withdrawing $"+amount +" from account number: " + accountNumber);
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("ERROR: InsufficientFundsException. keep coding java");
        }
    }

    public void purchase(String item, double price){
        System.out.println("purchasing " + item +" for $"+price);
        if (price <= balance){
            balance -= price;
        }else {
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance -= (price + 35);
        }
        System.out.println("transaction completed for "+item + ",current balance: "+balance);
    }

}
