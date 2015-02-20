package collections;

public class WrapperClassDemo {

	/*
	 * Java provides Class for each primitive Data Types
	 * 
	 * 1. int		-	Integer
	 * 2. float		-	Float
	 * 3. char		-	Character
	 * 4. double	-	Double
	 * 5. boolean	-	Boolean
	 */
	public static void main(String[] args) {
		/*
		int x = 100; 	//You are declaring 'x' as primitive data type
		int y = 200;
		int c = x + y;
		System.out.println(c);
		*/
		Integer a = 100; //You are declaring 'a' as Object
		Integer x = 100; 	//You are declaring 'x' as primitive data type
		Integer y = 200;
		Integer c = x + y;
		System.out.println(c);

		String s = "100"; //This is a String Object
		//You can define an Integer object in 2 ways
		Integer i1 = 100;
		//Or
		Integer i2 = new Integer(100);
		
		//You can convert a String to an Integer.
		
		int sInt = Integer.parseInt(s);
		//Note: Wrapper classes has methods to covert object from One type to another
		String str = i1.toString(); //This will convert the Integer value of i1 to String value
	
	}
}
