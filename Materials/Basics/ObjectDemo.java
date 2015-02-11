
public class ObjectDemo {

	public static void main(String[] args) {
		
		//Object Creation Syntax:
		//<ClassName> {objectName} = new <ClassName>
		/*
		 * 1. An object is an instance (copy) of the class.
		 * 2. Objects are independent of one another
		 * 3. Objects has its own memory.
		 * 4. We need not know the functionality when we use the Objects
		 */
		Car benz = new Car();
		//'new' refers to NEW Memory to be allocated to this Object
		Car toyoto = new Car();
		Car audi = new Car();
		
		//benz.turnLeft(); //Using the Object i am invoking a Method of that class
		//1. Using the Object we can access the MEMBERS of that class to which the Object belongs
		//Members of Car class are = wheels, windows, turnLeft(), turnRight()
		benz.wheels = 1000;
		benz.print("BENZ");
		
		toyoto.print("TOYOTO");
		audi.print("AUDI");
	}
}
