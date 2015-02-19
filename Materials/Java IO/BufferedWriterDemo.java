package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try {
			//1. Open the Stream
			FileWriter fw = new FileWriter("c:\\demo\\fileio\\Emplyee.txt", true); 
			//true - Means, APPEND the contents to existing content
			BufferedWriter bw = new BufferedWriter(fw);
			
			//2. Perform Write
			bw.write("This is my *** new *** content using Buffered Writer \n\r");
			
			bw.flush(); //SInce BufferedWriter Buffers the data, the data needs to be flushed
			//3. Close The stream
			fw.close();
			bw.close();
		}catch(FileNotFoundException fne) {
			System.out.println("Error: File Not Found..");
		} catch(IOException ioe) {
			System.out.println("IO Exception has occured.." + ioe.toString());
		}
	}
}
