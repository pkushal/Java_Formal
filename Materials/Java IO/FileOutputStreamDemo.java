package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Assignment:
//Read the File contents from test.txt and write the same to Employee.txt
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			//1. Open the Stream
			FileOutputStream fout = new FileOutputStream("c:\\demo\\fileio\\Emplyee.txt");
			//2. Perform Write Operation
			char c = 'J';
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
