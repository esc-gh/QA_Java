package AnimalChallenge;

public class Animal implements AnimalInterface, AnimalInterface2 {
	private int legsNumber = 4;
	private boolean canFly = false;
	private boolean hasFur = true;

	public int getLegsNumber() {
		return legsNumber;
	}

	public boolean checkFlight() {
		return canFly;
	}
	public boolean checkFur() {
		return hasFur;
	}

	public void extinct() {
		System.out.println("This animal is not extinct.");		
	}

	public void sleep() {
		System.out.println("This animal enjoys resting its eyes.");		
	}

}
