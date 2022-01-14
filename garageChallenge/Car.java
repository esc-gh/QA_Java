package garageChallenge;

public class Car extends Vehicle {
	private int seatNumber;
	private int doorNumber;
	private double repairCost = 250.25;

	public Car(int numberOfWheels, String manufacturer, String model, int seatNumber, int doorNumber) {
		super(numberOfWheels, manufacturer, model);
		this.seatNumber = seatNumber;
		this.doorNumber = doorNumber;
	}

	@Override
	public double getRepairCost() {
		return this.repairCost;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

//	@Override
//	public String toString() {
//		return "This is a " + this.getModel() + " " + this.className + ", made by " + this.getManufacturer();
//	}

}
