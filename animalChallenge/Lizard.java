package animalChallenge;

public class Lizard extends Animal {
	public boolean hasFur = false;
	private boolean eatsInsects = true;

	public boolean checkInsects() {
		return eatsInsects;
	}

	@Override
	public boolean checkFur() {
		return hasFur;

	}
}
