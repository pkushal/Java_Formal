package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] args) {

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
		} finally {
			//'finally' is a block which can be put along with try..
			//The code which is written inside finally is executed **ALWAYS**
			//The below print statement is Very important and SHOULD be Printed always..
			System.out.println("*********IMPORTANT********");
		}
	}
}
