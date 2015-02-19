package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * InputStream					Reader
 * OutputStream					Writer
 * 
 */

public class ReadWriteBuffer {

	public static void main(String[] args) {
		//InputStreamReader - Is a class which is used to convert InputStream to Reader
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader fis = new BufferedReader(isr);
			//System.in - represents the Standard Input Device - Keyboard
			//System.in - Is an InputStream Object which represents the SID - Keyboard
			FileWriter fout = new FileWriter("c:\\demo\\fileio\\MyFile.txt");
			BufferedWriter bw = new BufferedWriter(fout);
			
			System.out.println("Please enter a Line");
			String str =  fis.readLine();
			bw.write(str);
			bw.flush();
			System.out.println("Successfully written to the file..");
			
		} catch(FileNotFoundException ob) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//fis.close();
			//bw.close();
			//fout.close();
		}
	
	}

}
