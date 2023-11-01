package OOP_Ex;

import java.util.Comparator;

public enum SortOrder implements Comparator<Student> {
	BY_ID	((o1,o2) -> Integer.compare(o1.getId(),o2.getId())),
	BY_NAME	((o1,o2) -> o1.getName().compareTo(o2.getName())),
	BY_SCORE((o1,o2) -> Double.compare(o1.getScore(), o2.getScore()));

	private Comparator<Student> com;
	private SortOrder(Comparator<Student> s) {
		this.com = s;
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		return com.compare(o1, o2);
	}
}
