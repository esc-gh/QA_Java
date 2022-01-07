package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("a");
		arrayList.add("d");
		arrayList.add("b");
		arrayList.add("c");

		System.out.println(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		for (String i : arrayList) {
			System.out.println(i);
		}

		System.out.println(arrayList.get(2));

		arrayList.set(0, "alpha");
		System.out.println(arrayList);

//		arrayList.remove(3);
//		System.out.println(arrayList);

		arrayList.sort(null);
		System.out.println(arrayList);
		
		arrayList.clear();
		arrayList.add("4");
		arrayList.add("78");
		arrayList.add("23");
		arrayList.add("-1");
		
		// sorts as a string
		arrayList.sort(null);
		System.out.println(arrayList);
		
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(4);
		aList2.add(78);
		aList2.add(23);
		aList2.add(-1);
		
		//sorts integers properly now that array list method is changed
		System.out.println(aList2);
		aList2.sort(null);
		System.out.println(aList2);
		
		Collections.reverse(aList2);
		System.out.println(aList2);
		
		Collections.swap(aList2, 1, 3);
		System.out.println(aList2);
		
//		Collections.clone(aList2<0> 0, 3);
//		System.out.println(aList2);

	}

}
