package in.co.slides;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {

		TreeSet tSet = new TreeSet();

		// You can insert any object in the TreeSet. Here it is string

		tSet.add("Jay");
		tSet.add("Viru");
		tSet.add("Basanti");

		/*
		 * You can insert any object in the TreeSet. Primitive data type need to
		 * be converted into Objects before inserting.
		 */
		// Get all elements and print with help of Iterator interface
		Iterator it = tSet.iterator(); // Get an iterator

		System.out.println("Print All Elements with help of Iterator ");

		while (it.hasNext()) { // Checks if any element in list
			Object oo = it.next(); // Get next available element
			System.out.println(" From Iterator -- " + oo);
		}
		Object obj = tSet.last();// Show Last record
		System.out.println("Last value in TreeSet : " + obj);
		// Show the size of TreeSet
		System.out.println("Size of TreeSet : " + tSet.size());
		tSet.clear();// Clear all the records
		// Show that TreeSet is empty or not
		System.out.println("Is Empty " + tSet.isEmpty());

	}

}
