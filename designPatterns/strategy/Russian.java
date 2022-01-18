package designPatterns.strategy;

public class Russian implements Language {

	@Override
	public void farewell() {
		System.out.println("Do svidaniya");
	}

	@Override
	public void greeting() {
		System.out.println("Privet");

	}

}
