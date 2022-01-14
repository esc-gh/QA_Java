package library;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private List<Item> checkedOut = new ArrayList<>();
	private int id;
	private String name;
	private boolean borrowing;

	public void borrow(Item input) {
		checkedOut.add(input);
	}

	public void returned(Item input) {
		checkedOut.remove(input);
	}

	public void borrowStatus() {
		System.out.println("Items currently borrowed:");
		if (checkedOut.size() > 0) {
			for (Item i : checkedOut) {
				System.out.println(i);
			}
		} else {
			System.out.println("None!");
		}
	}

	public Person(String name) {
		this.name = name;
	}

	public boolean isBorrowing() {
		return borrowing;
	}

	public void setBorrowing(boolean borrowing) {
		this.borrowing = borrowing;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void update(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + ", ID: " + this.getId();
	}
}
