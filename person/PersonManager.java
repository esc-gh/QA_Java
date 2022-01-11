package person;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	List<Person> people = new ArrayList<>();
	List<Person> matches = new ArrayList<>();

	public void add(Person p1) {
		people.add(p1);
	}

	public void info() {
		for (Person i : people) {
			System.out.println(i);
		}
	}

	public void search(String input) {
		for (Person i : people) {
			if (i.getName() == input) {
				System.out.println(i);
			}
			else {
				System.out.println("No matches found.");
			}
		}
	}
	
	public void searching(String input) {
		matches.clear();
		for (Person i : people) {
			if (i.getName() == input) {
				matches.add(i);
			}
		}
		if (matches.size() > 0) {
			for (Person i : matches) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("No matches found!");
		}
	}
//	public void output(List<Person> x) {
//		x.stream().forEach(Person -> System.out.println(Person));
//	}
}
