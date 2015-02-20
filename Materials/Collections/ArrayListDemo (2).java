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
		ArrayList<Book> ob = new ArrayList<Book>();
		//The above declaration is using GENERICS.
		//The Above states that, the ArrayList object "ob" can hold only Book Objects.
		//If we try to add any other Objects other than Book, it gives a Compilation error
		//By Implemnting this you are sure than the Object has only one type of Objects
		//Stroing the Values in ArrayList
		ob.add(b1);
		ob.add(b2);
		ob.add(b3);
		ob.add(b1);
		//ob.add("Java");
		//ob.add(100);
		//System.out.println(ob);
		//Read values from ArrayList
		for (int i=0; i<ob.size(); i++) {
			Object obj = ob.get(i);
			//If we implement Generics, then below instanceof check is not required.
			if (obj instanceof Book) {
				Book b = (Book) obj;
				b.print();
			} else {
				System.out.println(obj);
			}
		}
		
	}
	
}
