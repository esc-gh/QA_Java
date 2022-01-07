package AnimalChallenge;

public class Lizard extends Animal {
	public boolean hasFur = false;
	private boolean eatsInsects = true;
	
	public boolean checkInsects() {
		return eatsInsects;
	}
	public boolean checkFur() {
		return hasFur;

}}
