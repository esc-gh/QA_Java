package solid.open;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormalGreeting f = new FormalGreeting();
		CasualGreeting c = new CasualGreeting();
		Greeter g = new Greeter(f);

//		g.setGreeting(f);
		System.out.println(g.greet());
		g.setGreeting(c);

		System.out.println(g.greet());
	}

}
