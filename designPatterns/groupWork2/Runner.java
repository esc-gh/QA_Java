package designPatterns.groupWork2;

public class Runner {

	public static void main(String[] args) {
		ClothesFactory cf = new ClothesFactory();

		ClothesType type1 = cf.getClothesType("JEANS");
		type1.produce();
		ClothesType type2 = cf.getClothesType("SOCKS");
		type2.produce();
		ClothesType type3 = cf.getClothesType("SWEATERS");
		type3.produce();

	}

}
