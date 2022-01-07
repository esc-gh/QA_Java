package iteration;

public class Flowcharts {
	int A;
	
	public void flow() {
		for(int A = 100; A < 201; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public void numbers() {
		for(int j = 0; j < 10; j++) {
			for(int i = 1; i < 11; i++) {
				System.out.print(i+"\n");
			}
		}
	}
	
	public void numbers2() {
		for(int j = 1; j <= 10; j++) {
			for(int i = 1; i <= j; i++) {
				System.out.print(j+"\n");
			}
		}
	}

}
