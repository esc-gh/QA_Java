package animalChallenge;

public class Bird extends Animal {
	private boolean hasBeak = true;
	private boolean canFly = true;
	private int legsNumber = 2;
	private boolean hasFur = false;

	public boolean checkBeak() {
		return hasBeak;
	}

	@Override
	public boolean checkFlight() {
		return canFly;
	}

	@Override
	public int getLegsNumber() {
		return legsNumber;
	}

	@Override
	public boolean checkFur() {
		return hasFur;
	}

}
