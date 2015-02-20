package collections;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String args[]) throws Exception {
		Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Show all states and capitals in hashtable.
		// states = capitals.keySet(); // get set-view of keys
		// Iterator itr = states.iterator();
		Set capKey = capitals.keySet();
		Iterator itr = capKey.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is "
					+ capitals.getProperty(str) + ".");
		}
		System.out.println();

		// look for state not in list -- specify default
		str = capitals.getProperty("Florida", "Not Found");
		// System.out.println("The capital of Florida is " + str + ".");

		// Loading from Properties file
		Properties empProp = new Properties();
		empProp.load(new FileInputStream(new File("employee.properties")));

		Iterator empItr = empProp.keySet().iterator();
		while (empItr.hasNext()) {
			str = (String) empItr.next();
			System.out.println("The Name of Employee " + str + " is "
					+ empProp.getProperty(str) + ".");
		}

	}
}