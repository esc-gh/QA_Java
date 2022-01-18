package designPatterns.strategy;

public class English implements Language {

	@Override
	public void farewell() {
		System.out.println("Goodbye");
	}

	@Override
	public void greeting() {
		System.out.println("Hello");
	}

}
