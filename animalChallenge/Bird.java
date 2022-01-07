package AnimalChallenge;

public class Bird extends Animal {
	private boolean hasBeak = true;
	private boolean canFly = true;
	private int legsNumber = 2;
	private boolean hasFur = false;

	public boolean checkBeak() {
		return hasBeak;
	}

	public boolean checkFlight() {
		return canFly;
	}

	public int getLegsNumber() {
		return legsNumber;
	}

	public boolean checkFur() {
		return hasFur;
	}

}
