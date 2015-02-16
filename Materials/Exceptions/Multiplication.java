package exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplication {
	
	//The 'throws' here is telling that, this method is CAPABLE of throwing 2 Exceptions
	//1. IOException	-	This is a CHECKED Exception
	//					-	This means that the Caller is Forced to put try..catch for this exception
	//					- 	Checked Exception is a SUBCLASS of Exception class
	//2. InputMismatchException - This is UNCHECKED Exception
	//							- The caller MAY catch or MAYNOT catch (Optional)
	//							- UNCHECKED Exception is a Subclass of RuntimeException class		
	void multiply() throws IOException, InputMismatchException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Integer value");
		try {
			int a = scan.nextInt();
			System.out.println("Please enter an another Integer value");
			int b = scan.nextInt();
			int c = a * b;
			System.out.println("Sum: " + c);
			
			IOException ob = new IOException(); //Creating an Object of Checked Exception
			throw ob; //Throwing back Checked Exception back to the caller
		} 
		catch(InputMismatchException ob) {//Unchecked Exception
			//Generic code..
			//System.out.println("The value you entered is not Valid..please try again!");
			throw ob;
			//The 'throw' is used to THROW an EXECPTION OBJECT back to the caller
		} 
		//System.out.println("***********End: Successfully Completed**********");
	}
}
