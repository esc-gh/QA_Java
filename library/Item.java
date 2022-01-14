package library;

public abstract class Item {
	private int stocked;
	private int available;
//	private boolean inStock;
	private int id;
	private String name;
	public static int totalItems;
//	private String 

	public Item(int stocked, int available, String name) {
		super();
		this.stocked = stocked;
		this.available = available;
		this.name = name;
	}

	public int getStocked() {
		return stocked;
	}

	public void setStocked(int stocked) {
		this.stocked = stocked;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return this.name;
	}

}
