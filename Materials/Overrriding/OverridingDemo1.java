
/*
 * This example demonstrates DYNAMIC Polymorphism
*/

public class OverridingDemo1 {

	public static void main(String[] args) {
		Area aobj = new Area(); //This is Super class Object
		//aobj - can access calculateArea(), m1() and m2()
		Rectangle rec = new Rectangle(); //This is a Sub Class Object
		//rec - can access calculateArea(), m1() and m2() and printArea()
		Square sq = new Square(); //This is a Sub CLass Object		
		//sq - can access calculateArea(), m1() and m2() and printArea()
		
		
		Area area = new Rectangle(); //Object of Super class is initialzed with Sub Class
		//The LHS = is a Super Class
		//The RHS = is a Sub Class
		//This is a VALID declaration.
		//area - can access calculateArea(), m1() and m2();
		area.calculateArea(); //The calculateArea method of Rectangle class will be called
		area.m1();
		area.m2();
		//area.printArea(); //Since the area object is of Area and Initized with Rectangle, This object CANNOT call EXTENDED methods of Sub class
		//Using an Object like above we can call ONLY OVERRIDEN Methods of Sub class
		System.out.println("************************************************************");
		area = new Square();
		area.calculateArea(); //The calculateArea method of Square class will be called
		area.m1();
		area.m2();

		//Notes:
		//1. Using the Object of Super class. We are able to call the OVERRIDEN Methods of Sub class.
	}

}


/*
	Rectangle rec = new Rectangle();
	
	Rectangle rec;
	rec = new Rectangle();
*/