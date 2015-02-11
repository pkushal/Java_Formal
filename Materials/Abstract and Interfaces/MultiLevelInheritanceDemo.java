
public class MultiLevelInheritanceDemo {
	
	/*
	 * super is a keyword in Java
	 * super has 2 forms
	 * 1. super.<member>
	 * 	 This form of super is used to access/call the variable or methods of Super class which are hidden
	 * 2. super(args)
	 *   This form of super is used toc all the Constructors of Super class
	 *   super() should be the first line inside the constructor
	 */
	public static void main(String[] args) {
		A aob = new A(10); //What methods i can access using aob? - a1()
		System.out.println("*******************");
		B bob = new B(20); //What methods i can access using bob? b1 and a1
		System.out.println("*******************");
		C cob = new C(); //What methods i can access using cob? c1, b1 and a1
		System.out.println("*******************");
		D dob = new D(); //What methods i can access using dob? d1, c1, b1 and a1
		System.out.println("*******************");
		//dob.a1();
		//dob.b1();
		//dob.c1();
		//dob.d1();
		
		//bob.b1();
		//A ob = new A(); //This is not possible as we have defined another constructor as Java will not create default constructor
	}
}

class A {
	
	//This is a Default Constructor
	A(int x) {
		System.out.println("In A Constructor: " + x);
	}
	int x = 100;
	void a1() {
		System.out.println("A.a1()");
	}
}
class B extends A {
//	B() { //This is giving an Error because, B() needs a similar constructor in Super class for Initialization (ie, A())
//		super(10); //Using super, i am telling Java that DO NOT search for a Default Constructor, but invoke another
//		//constructor which takes Int value 
//		System.out.println("In B Constructor");
//	}
	B(int x) {
		super(x);
	}

	int x = 200; // Here Sub class is OVERRDING/HIDING the variable x of SUper class
	void a1() { //Overide
		System.out.println("B.a1() - Overriden");
	}
	void b1() {
		System.out.println("X = " + super.x);
		super.a1(); //The method a1() can be called directly without an Object as a1 is in Super class
		//Java gives a Keyword called 'super'
		//The super is used in below scenario
		//1. When you want to call any members of the Super class which is Hidden (Overriden) by the Sub class
		//2. super can be used for accessing hidden members of Super class (When i say members = Variables + Methods)
		System.out.println("B.b1()");
	}
}

class C extends B {
	C() {
		super(10); //This will refer to B
		System.out.println("In C Constructor");
		
	}
	
	void c1() {
		System.out.println("C.c1()");
	}
}
class D extends C {
	D() {
		System.out.println("In D Constructor");
	}
	
	void d1() {
		System.out.println("D.d1()");
	}
}