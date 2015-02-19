package io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		try {
			PrintWriter ps = new PrintWriter("c:\\demo\\fileio\\printstreamFile.txt");
			ps.println("Below are 2 numbers****: ");
			ps.println(a);
			//ps.println();
			ps.println(b);
			ps.println("Test...");
			ps.println("Sum is: ");
			//ps.println();
			ps.print(a+b);
			ps.flush();
			
		}catch(IOException ioe) {
			
		}
	}
}
