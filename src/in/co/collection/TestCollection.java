package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		//create a collection
		Collection c = new ArrayList();
		c.add("ram");// index 0
		c.add("shyam");// 1
		c.add("mohan");// 2
		c.add("rohan");// 3
		System.out.println("length of collection: " + c.size());
		// print all element of collection
		for (Object ele : c) {
			System.out.println(ele);
		}
		// convert collection into array
		Object[] oArray = c.toArray();
		// print all element of array
		for (Object ele : oArray) {
			String s = (String) ele;
			System.out.println(s);

		}
	}

}
