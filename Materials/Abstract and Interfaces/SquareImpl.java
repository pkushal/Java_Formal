
public class SquareImpl extends AbstractArea { 
	void printArea() {
		System.out.println("Square Class - printArea Method");
	}
	void calculateArea() {
		int a = l * b;
		System.out.println("Square class: calculateArea() method: " + a);
	}	
}
