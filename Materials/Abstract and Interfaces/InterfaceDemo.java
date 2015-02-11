
/*
 * Interface is nothing but an Abstract class by Default
 * The difference between Interface and Abstract class is
 *  Abstract class can have Abstract Methods + Non-Abstract Methods
 *  Interfaces can have ONLY Abstract Methods (ie, all methods in Interface should not have any Body)
 *  One class can inherit only One Abstract Class
 *  One class can inherit more than one Interface
 */

public class InterfaceDemo {
	public static void main(String[] args) {

	}
}

interface MyInterface { //By Default all Methods inside an Interface is Abstract by default
	void m1();
	void m2();
}

interface MySecondInterface {
	void m3();
}

//USe 'implements' to inherit an Interface
//Rule in Abstract class - AANy class which inherits Abstract class SHOULD Override all Abstract Methods
//Rule in Interface - Any class which ineherits an Interface SHOULD override all Methods of that Interface bcoz, 
// All methods inside an INterface is ABSTRACT by default (Ie, it cannot have any body)
class MyInterfaceImpl implements MyInterface, MySecondInterface { //MyInterfaceImpl class has 2 parents
	public void m1() {
		System.out.println("Overriding m1 in class MyInterfaceImpl ");
	}
	public void m2() {
		System.out.println("Overriding m2 in class MyInterfaceImpl ");
	}	
	public void m3() {
		System.out.println("Overriding m3 in class MyInterfaceImpl ");
	}	
	
}