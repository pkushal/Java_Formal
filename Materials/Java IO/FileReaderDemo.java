package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//1. Open the Stream
			FileReader fis = new FileReader("C:\\demo\\fileio\\test.txt");
			//2. Perform Read
			/*
			char r = (char) fis.read(); //This read method will Read a Single Character from that file
			System.out.println(r);
			*/
			
			int r;
			while (( r = fis.read()) != -1) 
			//The read method returns the Decimal value of the Character
		    //The read method will return "-1" when it reaches End of the File
			{
				char c = (char) r;
				System.out.print(c);
			}
			//3. Close the Stream
			fis.close();
		}catch(FileNotFoundException fne) {
			System.out.println("Error: File Not Found..");
		} catch(IOException ioe) {
			System.out.println("IO Exception has occured..");
		}
	}
}
