package io;

import java.io.PrintStream;

public class SystemOutDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
			PrintStream ps = new PrintStream(System.out);
			//System.out - Is an Object of OutputStream which represents SOD - Console
			ps.println("Below are 2 numbers: ");
			ps.println(a);
			ps.print(b);
			ps.println("Sum is: ");
			ps.println(a+b);
			
			System.out.println("The above PS is same..");
			//System	-	This is an inbuilt class in Java
			//out		-	This is an inbuilt Object which represents Out put device - Monitor
			//			-	out is an object of PrintStream class
			//println 	-	This is the Method
	}
}
