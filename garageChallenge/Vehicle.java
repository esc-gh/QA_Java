package garageChallenge;

public abstract class Vehicle {
	private int numberOfWheels;
	private String manufacturer;
	private String model;
	private double repairCost;

	public Vehicle(int numberOfWheels, String manufacturer, String model) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Vehicle(int numberOfWheels, String manufacturer, String model, double repairCost) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.manufacturer = manufacturer;
		this.model = model;
		this.repairCost = repairCost;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}

	public abstract String getClassName();

	@Override
	public String toString() {
		return "This is a " + getModel() + " " + getClassName() + ", made by " + getManufacturer() + ".";
	}

//	@Override
//	public String toString() {
//		return "This is a " + this.model + ", made by " + this.manufacturer;
//	}
}
