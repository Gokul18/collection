package comaparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheetSortin {
	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList<>();
		marksheets.add(new Marksheet("4", "Surbhi", 100));
		marksheets.add(new Marksheet("2", "Swati", 99));
		marksheets.add(new Marksheet("3", "Sonam", 98));

		Collections.sort(marksheets);

		for (Object o : marksheets) {
			System.out.println(o);
		}

	}

}
