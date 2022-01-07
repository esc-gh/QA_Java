package arrays;

public class Array {
	public static void main(String[] args) {

		int[] exerciseArray = new int[10];

		for (int i = 0; i < 10; i++) {
			exerciseArray[i] = i + 1;
		}
		for (int i : exerciseArray) {
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			exerciseArray[i] *= 10;
		}
		for (int i : exerciseArray) {
			System.out.println(i);
		}
	}
}
