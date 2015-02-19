package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f =  new File("c:\\demo\\fileio");
		try {
			f.createNewFile();
			System.out.println("File Created..");

			boolean cr = f.canRead();
			System.out.println("File has Read Permission? " + cr);

			boolean cw = f.canWrite();
			System.out.println("File has Write Permission? " + cw);
			
			//f.delete(); //This will delete the file.
			
			boolean d = f.isDirectory();
			System.out.println("Is that a Directoty? : " + d);
			
			File fArr[] = f.listFiles();
			for (int i=0; i<fArr.length; i++) {
				
				System.out.println("*****************************");
				String name = fArr[i].getName();
				System.out.println("File Name: " + name);
				System.out.println(fArr[i].canWrite());
				System.out.println("*****************************");
			}
		
			File fo = new File("c:\\demo\\fileio\\subdir");
			fo.mkdir();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
