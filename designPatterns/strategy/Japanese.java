package designPatterns.strategy;

public class Japanese implements Language {

	@Override
	public void farewell() {
		System.out.println("Sayonara");
	}

	@Override
	public void greeting() {
		System.out.println("Kon'nichiwa");
	}

}
