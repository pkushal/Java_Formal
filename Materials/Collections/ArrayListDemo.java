package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	Book b1 = new Book(1, "Java");
	Book b2 = new Book(2, "Oracle");
	Book b3 = new Book(3, ".Net");
	

	public static void main(String[] args) {
		ArrayListDemo ob = new ArrayListDemo();
		ob.bookStore();
	}
	
	public void bookStore() {
		ArrayList ob = new ArrayList();
		//Stroing the Values in ArrayList
		ob.add(b1);
		ob.add(b2);
		ob.add(b3);
		
		//Read values from ArrayList
		for (int i=0; i<ob.size(); i++) {
			Book b = (Book) ob.get(i);
			b.print();
		}
		
	}
}
