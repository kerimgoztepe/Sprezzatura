package review_sessions.week4_variables_operators;

public class AmazonItem {

	public static void main(String[] args) {
		
        /*
        AmazonItem:
            - String title
            - String seller
            - double stars
            - int ratingsCount
            - double price
            - boolean bestSeller
            - boolean freeShipping
         */
		
       String title = "Wilson Tour Slam Lite Tennis Racket";
       String seller = "Amazon";
       double stars = 4.5;
       int ratingsCount = 248;
       double price = 26.18;
       boolean bestSeller = true;
       boolean freeShipping = true;

       System.out.println("Item title is " + title );
       
       //Seller name is <PersonalizedGallery>
       System.out.println("Seller name is <" + seller + ">");

       //Product has 4.5 stars
        System.out.println("Product has " + stars + " stars");
        
        //Product has 248 ratings!
        System.out.println("Product has " + ratingsCount + " ratings!");
        
        //Price is $26.18
        System.out.println("Price is $" + price);
        
        //Best seller is true
        System.out.println("Best seller is " + bestSeller);
        
        //Is it free shipping? -true Great!
        System.out.println("Is it free shipping? -" + freeShipping + " Great!");

        //######################################
        //city1, city2, ticketPrice
        String city1 = "New York";
        String city2 = "Chicago";
        double ticketPrice = 285.99;

        //From New York to Chicago is $285.99
        System.out.println("From "+city1+" to "+city2+" is $" +ticketPrice );

	}

}
