
public class StaticDemo {
	/*
	 * The static block code will be invoked BEFORE main method
	 */
	static {
		System.out.println("I am a static block..");
	}
	public static void main(String[] args) {
		System.out.println("First line in Main Method");
		Subtraction ob1 = new Subtraction();
		Subtraction ob2 = new Subtraction();
		
		ob1.x=100; ob1.y=200; Subtraction.out.method();
		ob2.x=10; ob2.y=20;
		
		Subtraction.x = 500; 
		//Static variable can be accessed using the Class Name
		Subtraction.print(); //print can be accessed using Class Name as its Static
		
		ob1.sub();
		ob2.sub();
		System.out.println("Calling SUB method from ob1 object again..");
		ob1.sub();
	}
}

/*
 * 1. Static methods can access Static Members (Variables + Methods)
 * 2. Static methods CANNOT access NON-STatic Members (Var + Methods)
 * 3. Non Static method CAN Access Static Variables/Methods
 */
class Subtraction {
	static int x;
	int y;
	static C1 out = new C1();
	
	void sub() {
		int c = x -y;
		System.out.println("Diff: " + c);
	}
	
	static void print() {
		System.out.println("Value of X = " + x);
		//System.out.println("Value of Y = " + y);
	}
}

class C1 {
	void method() {
		
	}
}