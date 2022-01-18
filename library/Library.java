package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Item> itemList = new ArrayList<>();
	private List<Person> people = new ArrayList<>();
	private static int idCount;
	private static int personCount;

	public void checkOut(int id, Person person) {
		for (Item i : this.itemList) {
			if (i.getId() == id) {
				if (i.getAvailable() > 0) {
					i.setAvailable(i.getAvailable() - 1);
					person.borrow(i);
					System.out.println(getClass().getSimpleName() + " " + i.getName() + " checked out\n"
							+ i.getAvailable() + " copies remaining");
				} else {
					System.out.println(getClass().getSimpleName() + " " + i.getName() + " unavailable");
				}
			}
		}
	}

	public void checkOut(String name, Person person) {
		for (Item i : this.itemList) {
			if (i.getName().equals(name)) {
				if (i.getAvailable() > 0) {
					i.setAvailable(i.getAvailable() - 1);
					person.borrow(i);
					System.out.println(getClass().getSimpleName() + " " + name + " checked out\n" + i.getAvailable()
							+ " copies remaining");
				} else {
					System.out.println(getClass().getSimpleName() + " " + name + " unavailable");
				}
			}
		}
	}

	public void checkIn(String name, Person person) {
		for (Item i : this.itemList) {
			if (i.getName().equals(name)) {
				i.setAvailable(i.getAvailable() + 1);
				person.returned(i);
				System.out.println(getClass().getSimpleName() + " " + name + " checked in\n" + i.getAvailable()
						+ " copies in stock");
			} else {
				System.out.println("No item found");
			}
		}
	}

	public void checkIn(int id, Person person) {
		for (Item i : this.itemList) {
			if (i.getId() == id) {
				i.setAvailable(i.getAvailable() + 1);
				person.returned(i);
				System.out.println(getClass().getSimpleName() + " " + i.getName() + " checked in\n" + i.getAvailable()
						+ " copies in stock");
			} else {
				System.out.println("No item found");
			}
		}
	}

	public void addItem(Item input) {
		idCount += 1;
		input.setId(idCount);
		itemList.add(input);
	}

	public void register(Person input) {
		personCount += 1;
		input.setId(personCount);
		people.add(input);
	}

	public void delete(Person input) {
		people.remove(input);
	}

	public void removeItem(Item input) {
		itemList.remove(input);
	}

	public void readRegister() {
		System.out.println(people);
	}

}
