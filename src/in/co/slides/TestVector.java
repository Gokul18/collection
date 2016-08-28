package in.co.slides;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {

        Vector v  = new Vector();
        // You can insert any object in the Vector. Here it is string

        v.add("Jay");
        v.add("Viru");
        v.add("Basanti");

        // Return type of get() method is Object.

        Object o = v.get(0);

        /* You can insert any object in the Vector. Here it is Integer
         * Primitive data type need to be converted into Objects before
         * inserting.
                  */
        Integer i = new Integer(5);
        v.add(i);

        // Type cast your object in desired Class
        Integer value = (Integer) v.get(3);
        System.out.println("Value of Index # 3 = " + value);

        // Get all elements and print

        System.out.println("Print All Elements with help of For loop ");

        for (int j = 0; j < v.size(); j++) {
            System.out.println(j + " : " + v.get(j));
        }

        // Get all elements and print with help of Iterator interface
        Iterator it = v.iterator(); // Get an iterator

        System.out.println("Print All Elements with help of Iterator ");

        while (it.hasNext()) { // Checks if any element in list
            Object oo = it.next(); // Get next available element
            System.out.println(" From Iterator -- " + oo);
        }

        // Get all elements and print with help of Enumeration interface
		Enumeration e = v.elements(); // Get java.util.Enumeration objects

        System.out.println("Print All Elements with help of Enumeration ");

        while (e.hasMoreElements()) { // Checks if any element in list
            Object oo = e.nextElement(); // Get next available element
            System.out.println(" From Enumeration -- " + oo);
        }

    }

}



