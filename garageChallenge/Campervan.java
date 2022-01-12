package garageChallenge;

public class Campervan extends Vehicle {
	private int bedNumber;
	private String className = this.getClass().getSimpleName();
	private double repairCost = 350;

	@Override
	public double getRepairCost() {
		return this.repairCost;
	}

	@Override
	public String getClassName() {
		return this.className;
	}

	public Campervan(int numberOfWheels, String manufacturer, String model, int bedNumber) {
		super(numberOfWheels, manufacturer, model);
		this.bedNumber = bedNumber;
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

}
