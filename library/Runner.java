package library;

public class Runner {

	public static void main(String[] args) {
		Book b1 = new Book(3, 2, 1, "Book1", "Ian Flemming", "Thriller", false);
		Book b2 = new Book(3, 0, 2, "Book2", "Erin Flemming", "Thriller", false);
		// TODO Auto-generated method stub

//		List<Item> itemList = new ArrayList<>();
		Library lib = new Library();
		lib.addItem(b1);
		lib.addItem(b2);

		Person p1 = new Person("John Sith");
		Person p2 = new Person("Jane Sith");

		lib.register(p1);
		lib.register(p2);
//		System.out.println(p1.getId());
//		System.out.println(p2.getId());
		lib.checkOut("Book1", p2);
		p1.borrowStatus();
		p2.borrowStatus();

		System.out.println(Item.totalItems);

	}

}
