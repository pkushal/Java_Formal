
public class Rectangle extends Area {
	void printArea() {
		System.out.println("Rectangle Class - printArea Method");
	}
	
	//Defining SAME METHOD with SAME NAME and SAME CASE as that of Super Class
	//We are Overring the Method of Super Class OR
	//We are HIDING the method of Super Class
	void calculateArea() {
		int a = l * b * 20;
		System.out.println("Rectangle class: calculateArea() method: " + a);
	}
}
