package in.co.slides;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add("Jay");
		v.add("Viru");
		v.add("Basanti");

		// Get all elements and print with help of Enumeration interface
		Enumeration e = v.elements(); // Get java.util.Enumeration objects

		System.out.println("Print All Elements with help of Enumeration ");

		while (e.hasMoreElements()) { // Checks if any element in list
			// Get next available element
			System.out.println(e.nextElement());
		}

	}

}
