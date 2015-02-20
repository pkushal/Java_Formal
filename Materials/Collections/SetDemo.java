package collections;

//Assignment: Demonstrate TreeMap.

import java.util.TreeSet;

public class SetDemo {

	public static void main(String args[]) {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		TreeSet<Integer> set = new TreeSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println("Values in TreeSet Object are:");
			System.out.println(set);

			System.out.println("The sorted list is:");

			System.out.println("The First element of the set is: "
					+ (Integer) set.first());
			System.out.println("The last element of the set is: "
					+ (Integer) set.last());

		} catch (Exception e) {
		}
	}
}