
public class Addition {

	int firstValue = 2;
	int secondValue = 3;
	
	//1. Any such function which has the SAME NAME as that of the CLASS NAME, we call that as "CONSTRUCTORS"
	//2. The CONSTRUCTORS are invoked WHEN  THE OBJECT is getting CREATED.
	//3. We use constructors when we need to perform some initialization
	Addition(int firstValue, int secondValue) {
		this.firstValue = firstValue; //Tell Java that the LHS variable is a an Instance Variable. How?
								 //Java gives a Keyword called "this"/
								 //"this", always refers to the Instance of the current class.
		this.secondValue = secondValue;
	}
	//Another constructor which take one value. This is Consturctor Overloading
	Addition(int x) {
		
	}
	int add() {
		int c = firstValue + secondValue;
		System.out.println("Sum = " + c);
		return c; 
	}
	
	int subtraction() {
		int c = firstValue - secondValue;
		return c;
	}
}
