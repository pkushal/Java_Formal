package collections;

//Assignment: What is Enumeration and its usage?
//Assigmnet: What is Vector?
//			 What is the difference between ArrayList and Vector;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String args[]) {
		Enumeration days;
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}