package exceptions;

import java.util.InputMismatchException;

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		Addition ob = new Addition();
		try {
			ob.add(); // The add() method is throwing InputMismatchException which is CAUGHT by the caller
		}catch(InputMismatchException ie) {
			System.out.println("The values were incorrect, please enter correct values!");
			ob.add();
		}
		System.out.println("After calling add..");
		//Some code goes here...
		System.out.println("End of the Main Method");
	}
}
