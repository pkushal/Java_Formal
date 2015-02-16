package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {
	
	//The throws tells that this add() method will not handle the Exception, but will throw the Exception back
	void add() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Integer value");
		try {
			int a = scan.nextInt();
			System.out.println("Please enter an another Integer value");
			int b = scan.nextInt();
			int c = a + b;
			System.out.println("Sum: " + c);
		} 
		catch(InputMismatchException ob) {
			//Generic code..
			//System.out.println("The value you entered is not Valid..please try again!");
			throw ob;
			//The 'throw' is used to THROW an EXECPTION OBJECT back to the caller
		} 
		System.out.println("***********End: Successfully Completed**********");
	}
}
