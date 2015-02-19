package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try {
			//1. Open the Stream
			FileReader fr = new FileReader("C:\\demo\\fileio\\test.txt");
			BufferedReader br = new BufferedReader(fr);
			//2. Read from the stream.
			/*
			String str = br.readLine();
			System.out.println(str);
			*/
			String str;
			while ((str=br.readLine()) != null) { //The End of the File is NULL here, hence we are checking for != null
				System.out.println(str);
			}
			//3. Close the stream
			br.close();
			fr.close();
		}catch(FileNotFoundException fne) {
			System.out.println("Error: File Not Found..");
		} catch(IOException ioe) {
			System.out.println("IO Exception has occured..");
		}
	}
}
