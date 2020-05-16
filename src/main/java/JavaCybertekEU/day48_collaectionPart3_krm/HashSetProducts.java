package day48_collaectionPart3_krm;

import day46_collection_part1.Product;

import java.util.HashSet;
import java.util.Set;

public class HashSetProducts {
    public static void main(String[] args) {
        Set<Product> prodSet = new HashSet<>();

        prodSet.add(new Product("item1", 23.4));
        prodSet.add(new Product("item2", 34.44));
        prodSet.add(new Product("item3", 346.4));

        System.out.println(prodSet.toString());
    }



}


