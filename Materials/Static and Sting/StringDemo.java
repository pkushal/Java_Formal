
public class StringDemo {

	public static void main(String[] args) {
		char c = 'J'; //Here 'c' is a variable because char is a datatype
		
		//Beow, name is an object because String is a class
		//String name = "Java";
		//Below declaration is same as above
		String name = new String("Java");
		//WE are creating an Object of class called String. 'name' is an Object
		String ob = new String("Hello");
		
		System.out.println(name);
		
		name = "World"; //This is similar to String name = new String("World");
		String uc = name.toUpperCase();
		System.out.println(uc);
		
	}
}
