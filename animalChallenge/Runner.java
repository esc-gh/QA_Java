package AnimalChallenge;

public class Runner {
	public static void main(String[] args) {
		Lizard liz = new Lizard();

		System.out.println(liz.getLegsNumber());
		System.out.println(liz.checkFur());
		System.out.println(liz.checkFlight());
		liz.sleep();
	}
}
