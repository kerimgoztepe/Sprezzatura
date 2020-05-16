package review_sessions.week8_classObject_scanner;

public class Product {
	
    String title;
    double price;
    int rating;
    String seller;
    
    //custom method to act as behavior for Product class
    public void displayInfo(){
        System.out.println(" --- Product info ---");
        System.out.println("title = " + title);
        System.out.println("price = $" + price);
        System.out.println("rating = " + rating);
        System.out.println("seller = " + seller);
        System.out.println( " ----------------");
    }
	
	

}
