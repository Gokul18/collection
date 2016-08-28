package comaparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorSorting {
	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList();

		marksheets.add(new Marksheet("4", "Surbhi", 100));
		marksheets.add(new Marksheet("2", "Swati", 99));
		marksheets.add(new Marksheet("3", "Sonam", 98));

		OrderByName byName = new OrderByName();
		System.out.println("Sorting byName");
		Collections.sort(marksheets, byName);

		for (Object o : marksheets) {
			System.out.println(o);
		}

		OrderByMarksDesc desc = new OrderByMarksDesc();
		System.out.println("Sorting OrderBydesc");
		Collections.sort(marksheets, desc);

		for (Object o : marksheets) {
			
			System.out.println(o);
		
		}

	}

}
