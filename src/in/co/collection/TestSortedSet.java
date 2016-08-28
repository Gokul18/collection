package in.co.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("one");
		s.add("two");
		s.add("three");
		// element r automatically stored in accending order
		for (Object ele : s) {
			System.out.println(ele);
		}
		// get first element(one)
		System.out.println(s.first());
		// get last element(two)
		System.out.println(s.last());

	}
}
