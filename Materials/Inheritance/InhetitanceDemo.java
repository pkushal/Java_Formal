
public class InhetitanceDemo {
	
	/*
	 * Inheritance is a OOP where we can inherit the features(MEMBERS) of one class into another class
	 */
	public static void main(String[] args) {
		Calculate ob = new Calculate();
		ob.myVar = 3000;
		//The variable 'myVar' is defined in Super class of Calculate
		
		int a = ob.multiply(10, 20);
		System.out.println("Product: " + a);
		
		int x = ob.add(10, 20); 
		//'add' method is defined in MathOperations class
		//I am able to invoke this add method using an Object of 'Calculate' class
		//Bcoz, Calculate is a SUB CLASS of MathOperations
		
		//1. Any Sub Class can access the MEMEBRS of Super Class.
		System.out.println("Sum = " + x);
		//By Object of Child class we can access members of Parent class + Additional Members of Child
		MathOperations mo = new MathOperations();
		//By Object of Parent class we cannot access members of Child Class
		//We can access only the Parent class members
	
	}
}
