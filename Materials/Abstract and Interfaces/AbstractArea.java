
public abstract class AbstractArea {
	
	int l = 10;
	int b = 20;
	//The calculateArea method of Area class is not Invoked as this method is being Overriden by Sub classes.
	//There is no use for giving any body for this method
	//The Purpose of this method is JUST TO SERVE METHOD OVERRIDING
	//Any such method which is defined Just for Overriding and defined to allow Sub classes to provide the 
	//actual implementation for those methods, can be defined as abstract methods.
	//Any method which is defined as abstract, should not have any Body
	//Any class which has atleast one abstract method should be defined as Abstract class
	//Any class which inherits abstract class must override the abtstract methods and provide the body
	abstract void calculateArea();
	
	void m1() {
		System.out.println("Area Class - m1 Method");
	}
	void m2() {
		System.out.println("Area Class - m2 Method");
	}
}
