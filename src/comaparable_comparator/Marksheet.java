package comaparable_comparator;

public class Marksheet implements Comparable<Marksheet> {
	private String rollNo;
	private String name;
	private int marks;

	public Marksheet(String rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.rollNo);
	}

	public String toString() {
		return rollNo + "," + name + "," + marks;
	}

}
