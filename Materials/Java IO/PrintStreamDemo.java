package io;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		try {
			PrintStream ps = new PrintStream("c:\\demo\\fileio\\printstreamFile.txt");
			ps.print("Below are 2 numbers: ");
			ps.print(a);
			ps.println();
			ps.print(b);
			ps.println();
			ps.print("Sum is: ");
			ps.println();
			ps.print(a+b);
			
		}catch(IOException ioe) {
			
		}
	}
}
