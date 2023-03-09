package JavaCybertekEU.review_sessions.week12_arrayList;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


        public static void main(String[] args) {
            // Create a new HashMap
            Map<String, Integer> myMap = new HashMap<>();

            // Add some key-value pairs to the map
            myMap.put("John", 25);
            myMap.put("Sarah", 32);
            myMap.put("Mike", 19);

            // Get the value associated with a key
            int johnAge = myMap.get("John");
            System.out.println("John's age is: " + johnAge);

            // Check if a key is in the map
            boolean containsSarah = myMap.containsKey("Sarah");
            System.out.println("Does the map contain Sarah? " + containsSarah);

            // Iterate over the keys in the map
            for (String name : myMap.keySet()) {
                int age = myMap.get(name);
                System.out.println(name + " is " + age + " years old");
            }

            // Remove a key-value pair from the map
            myMap.remove("Mike");
        }
    }
    //In this example, we create a HashMap that maps String keys to Integer values. We add some key-value pairs to the map, and then retrieve the value associated with the "John" key using the get() method. We also use the containsKey() method to check if the map contains a certain key.

    //We then iterate over the keys in the map using a for-each loop, and print out each key-value pair. Finally, we remove a key-value pair from the map using the remove() method.







