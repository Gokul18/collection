package in.co.slides;

import java.util.Enumeration;
import java.util.Hashtable;

public class TreeHashMap {
	public static void main(String[] args) {

		Hashtable hTable = new Hashtable();

		/*
		 * You can insert any object in the HasTable with key and value pair.
		 * Here it is string
		 */
		hTable.put("RN1001", new Integer(890));
		hTable.put("RN1002", new Integer(900));
		hTable.put("RN1003", new Integer(780));
		hTable.put("RN1004", new Integer(950));

		// Display the size of HashTable
		System.out.println("Size of HashTable is : " + hTable.size());

		// Show the value at given key
		System.out.println("Value at given key : " + hTable.get("RN1003"));

		Enumeration en = hTable.elements();

		System.out.println("Print All Elements with help of Enumeration ");

		while (en.hasMoreElements()) {
			Object oo = en.nextElement();
			System.out.println(" From Enumeration -- " + oo);
		}

		// Remove value at given key
		System.out.println("Remove value at given key : "
				+ hTable.remove("RN1003"));

		// Will remove all elements
		hTable.clear();

		// Show that HashTable is empty
		System.out.println("Is Empty : " + hTable.isEmpty());

	}

}
