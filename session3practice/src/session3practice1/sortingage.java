package session3practice1;

import java.util.Comparator;

public class sortingage implements Comparator<person1> {

	@Override
	public int compare(person1 o1, person1 o2) {
		return o1.getAge()-o2.getAge();
	}

}
