package designPatterns.groupWork2;

public class ClothesFactory {
	public ClothesType getClothesType(String clothesType) {
		if (clothesType == null) {
			return null;
		}
		if (clothesType.equalsIgnoreCase("Jeans")) {
			return new Jeans();
		} else if (clothesType.equalsIgnoreCase("Socks")) {
			return new Socks();
		} else if (clothesType.equalsIgnoreCase("Sweater")) {
			return new Sweater();
		}
		return null;
	}

}
