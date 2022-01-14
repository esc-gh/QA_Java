package garageChallenge;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}

	public void roster() {
		for (int i = 0; i < garage.size(); i++) {
			System.out.println(i + 1 + ": " + garage.get(i));
		}
	}

	public void getBills() {
		for (int i = 0; i < garage.size(); i++) {
			System.out.println(i + 1 + ": " + garage.get(i));
			System.out.println("Repair cost: £" + garage.get(i).getRepairCost());
		}
	}

	public void remove(int i) {
		garage.remove(i - 1);
	}

	public void fix(int i) {
		System.out.println(i + ": Repair Cost = £" + garage.get(i - 1).getRepairCost());
	}

	public void filterClass(String name) {
		for (Vehicle i : new ArrayList<>(garage)) {
			if (name.equalsIgnoreCase(i.getClass().getSimpleName())) {
				System.out.println(i.getModel() + " " + i.getClass().getSimpleName() + " is no longer in the Garage.");
				garage.remove(i);
			}
		}
	}

	public void empty() {
		garage.clear();
	}
}
