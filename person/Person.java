package person;

public class Person {
	private String name;
	private int age;
	private String job;

	public void person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;	
		name.contains("name");
	}

	public String info() {
		return name + " is a " + age + " year-old " + job;
	}

	@Override
	public String toString() {
		return name + " is a " + age + " year-old " + job;
	}
	
	public String getName() {
		return this.name;
	}
}
