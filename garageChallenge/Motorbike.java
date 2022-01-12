package garageChallenge;

public class Motorbike extends Vehicle {
	private boolean hasSidecar;
	private String className = this.getClass().getSimpleName();
	private double repairCost = 200;

	@Override
	public double getRepairCost() {
		return this.repairCost;
	}

	@Override
	public String getClassName() {
		return this.className;
	}

	public Motorbike(int numberOfWheels, String manufacturer, String model, boolean hasSidecar) {
		super(numberOfWheels, manufacturer, model);
		this.hasSidecar = hasSidecar;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

}
