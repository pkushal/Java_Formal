package exceptions;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		Multiplication ob = new Multiplication();
		try {
			ob.multiply();
		} catch (IOException e) {
			System.out.println("Error..");
		}
	}
}
