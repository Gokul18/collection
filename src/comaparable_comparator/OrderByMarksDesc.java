package comaparable_comparator;

import java.util.Comparator;

public class OrderByMarksDesc implements Comparator<Marksheet> {
	public int compare(Marksheet m1, Marksheet m2) {
		if (m1.getMarks() > m2.getMarks()) {
			return -1;
		} else {
			if (m1.getMarks() == m2.getMarks()) {
				return 0;
			} else {
				return 1;
			}
		}
	}

}
