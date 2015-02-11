
//'extends' is a keyword in Java used for Inhetitance
//Calculate class is called a CHILD CLASS (or, Sub Class)
//MathOperations Class is called PARENT CLASS (or, Super Class)
public class Calculate extends MathOperations {
	int multiply(int x, int y) {
		int c = x * y;
		return c;
	}
}
