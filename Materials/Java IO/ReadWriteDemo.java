package io;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteDemo {
	
	//Read the values from User (Keyboard)
	//Write those to a File
	public static void main(String[] args) {
		try {
			BufferedInputStream fis = new BufferedInputStream(System.in);
			//System.in - represents the Standard Input Device - Keyboard
			FileOutputStream fout = new FileOutputStream("c:\\demo\\fileio\\MyFile.txt");

			System.out.println("Please enter a Character");
			char c = (char) fis.read();
			fout.write(c);
			System.out.println("Successfully written to the file..");
			
			fis.close();
			fout.close();
			
		} catch(FileNotFoundException ob) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
