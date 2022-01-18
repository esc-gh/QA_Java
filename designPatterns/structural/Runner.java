package designPatterns.structural;

public class Runner {

	public static void main(String[] args) {
		Mallard m = new Mallard();
		WildTurkey w = new WildTurkey();
		Turkey d = new DuckAdapter(m);
		Duck t = new TurkeyAdapter(w);

		m.quack();
		m.fly();
		d.gobble();
		d.fly();
		w.gobble();
		w.fly();
		t.quack();
		t.fly();

	}

//	public

}
