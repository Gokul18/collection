package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("zero");// index 0
		l.add("one");// 1
		l.add("two");// 2
		l.add("three");// 3
		l.add("five");// 4
		l.add(4, "four");// insert at index 4
		// get an element by index
		String val = (String) l.get(1);
		// print all element
		for (Object ele : l) {
			String str = (String) ele;
			System.out.println(str);
		}
		// sort the list
		Collections.sort(l);
		System.out.println(l);

	}

}
