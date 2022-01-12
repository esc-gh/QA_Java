package garageChallenge;

public class Runner {
	public static void main(String[] args) {
		Car car = new Car(4, "Mazda", "MX5", 2, 3);
		Campervan cv = new Campervan(4, "Hyperion", "Claptrap", 1);
		Motorbike mb = new Motorbike(2, "Harley", "Quinn", false);

		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(cv);
		garage.addVehicle(mb);

//		System.out.println(car);
//		System.out.println(garage);
//		garage.roster();
		garage.roster();
		garage.filterClass("car");
		garage.getBills();
		garage.fix(2);
	}

}
