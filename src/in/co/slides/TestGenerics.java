package in.co.slides;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestGenerics {
	    public static void main(String[] args) {

	                //Define a List and communicate its elements' data type to compiler

	        ArrayList<String> l = new ArrayList<String>();
	        l.add("One");
	        l.add("Two");
	        l.add("Three");
	        l.add("Four");
	        l.add("Five");

	        String str = l.get(2); //No Type cast
	        System.out.println(str);

	        Iterator<String> it = l.iterator();

	                System.out.println("List elements ");

	        while (it.hasNext()) {
	            System.out.println(it.next());

	        }

	                //Define a Map and communicate its Key and Value data types to compiler
	        
		HashMap<String,Integer> map  = new HashMap<String,Integer>();
	        map.put("One", new Integer(1));

	    }
	   
}
