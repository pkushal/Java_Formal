
public class MathOperations {
	
	int myVar = 1000;
	//We can define Multiple methods with the same name in same class
	//Method Overloading: Is a concept which supports Polymorphism. 
	//A method is said to be Overloaded, when we have multiple methods with same name. Provided---
	//1. The Arguments of Method should vary
	//2. Or, the Argument type (Data type) should vary
	
	int add(int x, int y) {
		int c = x + y;
		return c;
	}
	
	double add(int a, double b) {
		double x= a + b;
		return x;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}

	int add(int x, int y, int z, int a) {
		return x + y + z + a;
	}
	
}
