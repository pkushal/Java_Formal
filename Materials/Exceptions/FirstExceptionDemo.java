package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FirstExceptionDemo {
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
			System.out.println("The value you entered is not Valid..please try again!");
		} catch(NoSuchElementException ob) {
			System.out.println("Error occured...");
		}
		catch(Exception e) {
			System.out.println("This is a General Catch..");
		}		
		System.out.println("***********End: Successfully Completed add() method**********");
	}
}

class AB {
	FirstExceptionDemo ob = null;
	void m() {
		ob = new FirstExceptionDemo();
	}
	
	void m1() {
		for (int i=0; i<100; i++) {
			FirstExceptionDemo o = new FirstExceptionDemo();
			ob = new FirstExceptionDemo();
		}
		
		//ob.
	}
}
/*

try {

	//Code 
	//1. When an Exception/Problem occurs here. Java will create an Object of a Class (Which class?)
	//2  Java will create an Object Exception class
	//3. What is Exception class - Exception class is an in-built class in Java
}catch(<Exeption Class> object)
 {
 	//Write the code to take corrective action
 }


*/