package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Book b1 = new Book(1, "Java");
		Book b2 = new Book(2, "Oracle");
		Book b3 = new Book(3, ".Net");

		HashMap<String, Book> map = new HashMap<String, Book>();
		map.put("Java", b1); //Key and Value
		map.put("Oracle", b2);
		map.put("MS", b3); 
		
		Book b = (Book) map.get("MS");
		b.print();
		
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		for (int i=0; i<al.size(); i++) {
			Book book = (Book) al.get(i);
			System.out.println(book.bookName);
			if (book.bookName.equals(".Net")) {
				book.print();
			}
		}
	}
}
