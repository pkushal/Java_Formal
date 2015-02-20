package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Book> hashSet = new HashSet<Book>();
		
		Book b1 = new Book(1, "Java");
		Book b2 = new Book(2, "Oracle");
		Book b3 = new Book(3, ".Net");
		
		hashSet.add(b1);
		hashSet.add(b2);
		hashSet.add(b3);
		hashSet.add(b1);
		
		Iterator itr = hashSet.iterator();
		
		while (itr.hasNext()) {
			Book b =  (Book) itr.next();
			b.print();
			System.out.println(b);
		}
	}

}
