package comaparable_comparator;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet> {
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.getName().compareTo(m2.getName());
	}

}
