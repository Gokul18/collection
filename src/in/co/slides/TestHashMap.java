package in.co.slides;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {

		HashMap hMap = new HashMap();

		// Below HashMap contains RollNo and their respective marks

		hMap.put("RN1001", new Integer(890));
		hMap.put("RN1002", new Integer(900));
		hMap.put("RN1003", new Integer(780));
		hMap.put("RN1004", new Integer(950));

		/*
		 * You can insert any object in the HashMap. Primitive data type need to
		 * be converted into Objects before inserting.
		 */

		// Display the size of Map
		System.out.println("Size of Map is " + hMap.size());

		Object obj = hMap.get("RN1002");
		// Display the value of given key
		System.out.println("Value of Index # = " + obj);

		// Remove the value of given key
		System.out.println("Remove the value of given key "
				+ hMap.remove("RN1002"));

		// Will remove all elements
		hMap.clear();

		// Show that HashMap is Empty or not
		System.out.println("Is Empty :-" + hMap.isEmpty());

	}

}
