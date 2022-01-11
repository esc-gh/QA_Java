package person;

public class Runner {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.person("Adam", 21, "Artist");
		p2.person("Bridget", 24, "Builder");
		p3.person("Carlton", 43, "Chef");

		PersonManager pm = new PersonManager();
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);
	
		pm.searching("Bridget");
		pm.searching("John");
	}
}


