
/*
 * MEMBERS of the class = Members of the class includes its Instance Variables + Methods.
 * For ex, what are the members of Car class?
 * 	wheels, windows, turnLeft(), turnRight().
 * 
 *Note: The variable 'speed' is not considered as Member of the class. ie, Local variables are not considered as Members of class
 */

public class Car { //'Car' is a user defined name
	
	int wheels = 4;
	int windows = 5;
	/*
	 * The variables defined above are called Global Variables.
	 * Global variables are variables which are defined Inside the class
	 * BUT outside a Function.
	 * The global variable can be accessed anywhere inside the class.
	 * The global variables in Java is called as "INSTANCE VARIABLE" (Instance = Object)
	 * (These variables are called Instance Variables because these can be accessed from Instance of this class (ie, Objects)
	 */
	
	//turnLeft is a Function
	//In Java, we refer the Functions as "METHODS"
	void turnLeft() {
		int speed = 80; //This variable is called local variable
		//Local Variable is a Variable which is defined inside the function.
		//Local variable can be accessed ONLY inside the fucntion where its defined.
		System.out.println("Turning the car Left");
		wheels = 5;
	}
	
	//turnRight is a Function
	void turnRight() {
		//speed = 90; //The speed variable is a local variable within function turnLeft()
		System.out.println("Turning the car Right");
		wheels = 4;
	}
	
	void print(String name){ //This method accepts a String value 
		System.out.println(name + " Wheels  = " + wheels);
		System.out.println(name + " Windows = " + windows);
	}
	
}
