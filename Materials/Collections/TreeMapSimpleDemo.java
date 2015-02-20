package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSimpleDemo {

	public static void main(String[] args) {
		Book b1 = new Book(1, "Java");
		Book b2 = new Book(2, "Oracle");
		Book b3 = new Book(3, ".Net");

		TreeMap map = new TreeMap();
		//Difference between HashMap and TreeMap
		//TreeMap - STore the values in Sorted Order
		map.put("Java", b1); //Key and Value
		map.put("Oracle", b2);
		map.put("MS", b3); 
		
		/*
		 * Steps to Iterate Map Objects
		 * 1. Get the Keys
		 * 2. Get the Iterator Object for the Keys
		 * 3. Look Through the Iterator
		 */
		Set keys = map.keySet(); //keySet will give all the Keys stored inside this HashMap
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			String key = (String) itr.next();
			Book b = (Book) map.get(key);
			b.print();
		}
	}
}


