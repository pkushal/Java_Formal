package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {

		Book b1 = new Book(1, "Basic Java");
		Book b2 = new Book(2, "Oracle");
		Book b3 = new Book(3, ".Net");
		Book b4 = new Book(1, "Java Servlets");
		Book b5 = new Book(1, "Java Server Pages");
		Book b6 = new Book(1, "Java Faces");
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		
		HashMap map = new HashMap();
		map.put("Oracle", b2);
		map.put("MS", b3); 
		map.put("Java", bookList); //Since we are using same Key for b1 and b4, Java will override b1 with b4
		//We cannot have 2 keys with same name
	}
}
