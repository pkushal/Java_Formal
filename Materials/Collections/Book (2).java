package collections;

public class Book {
	
	int bookId;
	String bookName;
	
	Book(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	void print() {
		System.out.println("Book ID = " + bookId + " Book Name: " + bookName);
	}
		
	public String toString() { //Overriding the toString() method which is in Object class.
		//Object class is a the Super class for Book class
		return "Book ID = " + bookId + " Book Name: " + bookName;
	}
}
