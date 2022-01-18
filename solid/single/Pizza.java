package solid.single;

public class Pizza {
	private String name;
	private int noOfTopping;
	private String size;

	public Pizza(String name, int noOfTopping, String size) {
		super();
		this.name = name;
		this.noOfTopping = noOfTopping;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfTopping() {
		return noOfTopping;
	}

	public void setNoOfTopping(int noOfTopping) {
		this.noOfTopping = noOfTopping;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
