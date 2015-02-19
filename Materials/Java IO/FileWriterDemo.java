package io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		try {
			//1. Open the Stream
			FileWriter fout = new FileWriter("c:\\demo\\fileio\\Emplyee.txt");
			//2. Perform Write Operation
			char c = 'F';
			fout.write(c);
			//3. Close the stream
			fout.close();
		}catch(FileNotFoundException fne) {
			System.out.println("Error: File Not Found..");
		} catch(IOException ioe) {
			System.out.println("IO Exception has occured..");
		}
	
	}

}
