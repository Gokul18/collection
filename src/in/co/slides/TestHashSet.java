package in.co.slides;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	 public static void main(String[] args) {

	        HashSet hSet = new HashSet();

	        // You can insert any object in the HashSet. Here it is string

	        hSet.add("Jay");
	        hSet.add("Viru");
	        hSet.add("Basanti");

	        System.out.println("Some Importent Methods");
	        System.out.println(" Set size : " + hSet.size());
	        System.out.println(" Contains Jay : " + hSet.contains("Jay"));

	        /*
	         * Primitive data type need to be converted into Objects before
	         * inserting. Get all elements and print with help of Iterator interface
	         */
		Iterator it = hSet.iterator(); // Get an iterator

	        System.out.println("\nPrint All Elements with help of Iterator ");

	        while (it.hasNext()) { // Checks if any element in list
	            Object oo = it.next(); // Get next available element
	            System.out.println(" From Iterator -- " + oo);
	        }

	        // Clear all elements
	        hSet.clear();
	        System.out.println(" Is Empty " + hSet.isEmpty());

	    }
}
