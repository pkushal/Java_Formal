package collections;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
		// Create a hash map
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		// Put elements to the map
		tm.put("Thierry", 700);
		tm.put("Madhavi", 500);
		tm.put("Felix", 100);
		tm.put("Ruifeng", 900);
		tm.put("Raj", 200);

		// Get an iterator
		Iterator<String> i = tm.keySet().iterator();
		// Display elements
		while (i.hasNext()) {
			String key = i.next();
			System.out.print("Key : " + key);
			System.out.println(" Value = " + tm.get(key));
		}
		System.out.println();
	}
}