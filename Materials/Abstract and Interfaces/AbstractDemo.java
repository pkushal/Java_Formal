
public class AbstractDemo {

	public static void main(String[] args) {
		//AbstractArea aobj = new AbstractArea(); //This is Super class Object
		//*** Any Abstract class cannot be intantiated ***
		AbstractArea area = null; // A Null can be created, but you cannot initialize that Object with AbstractArea
		
		area = new RectangleImpl(); //Object of Super class is initialzed with Sub Class
		//The LHS = is a Super Class
		//The RHS = is a Sub Class
		//This is a VALID declaration.
		//area - can access calculateArea(), m1() and m2();
		area.calculateArea(); //***The calculateArea method of Rectangle class will be called
		//area.printArea(); //Since the area object is of Area and Initized with Rectangle, This object CANNOT call EXTENDED methods of Sub class
		//Using an Object like above we can call ONLY OVERRIDEN Methods of Sub class
		//area.printArea(); //This is not possible as 'area' object here can call only OVERRIDEN methods
		
		System.out.println("************************************************************");
		area = new SquareImpl();
		area.calculateArea(); //***The calculateArea method of Square class will be called

		//Notes:
		//1. Using the Object of Super class. We are able to call the OVERRIDEN Methods of Sub class.
	
		AbstractArea a = new RectangleImpl();
		RectangleImpl ob = (RectangleImpl)a; //Explicitly type cast the Object of Super class to an Object of Sub class
		ob.printArea();//the above line is similar to - RectangleImpl ob = new RectangleImpl();
	}

}
