package review_sessions.week8_classObject_scanner;

public class EtsyShop {

	public static void main(String[] args) {
		
        //Declare 2 Product objects
        Product prodObj1 = new Product();
        Product prodObj2 = new Product();

        //assign values to prodObj1
        prodObj1.title = "Wooden Banana";
        prodObj1.price = 4.5;
        prodObj1.rating = 5;
        prodObj1.seller = "BananaSeller";

        System.out.println(prodObj1.title );
        System.out.println(prodObj2.title );
        //assign values to prodObj2
        prodObj2.title = "Wool Gloves";
        prodObj2.price = 25.44;
        prodObj2.rating = 4;
        prodObj2.seller = "WoolSeller";
        //prodObj2.freeShipping = false; ERROR: this variable not in Product class

        //print values from prodObj1
        System.out.println("---- prodObj1 data ----");
        System.out.println("prodObj1 title: " + prodObj1.title);
        System.out.println("prodObj1 price: " + prodObj1.price);
        System.out.println("prodObj1 rating: " + prodObj1.rating);
        System.out.println("prodObj1 seller: " + prodObj1.seller);

        //print values from prodObj2
        System.out.println("---- prodObj2 data ----");
        System.out.println("prodObj2 title: " + prodObj2.title);
        System.out.println("prodObj2 price: " + prodObj2.price);
        System.out.println("prodObj2 rating: " + prodObj2.rating);
        System.out.println("prodObj2 seller: " + prodObj2.seller);

        //call the method of Product class
        //objName.methodName();
        prodObj1.displayInfo();
        prodObj2.displayInfo();

	}

}
