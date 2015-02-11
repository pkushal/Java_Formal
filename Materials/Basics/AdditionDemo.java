
public class AdditionDemo {

	public static void main(String[] args) {
		
		Addition ob = new Addition();
		ob.a = 100;
		ob.b = 200;
		int sum = ob.add();
		System.out.println("The sum of " + ob.a + " and " + ob.b + " = " + sum);
	}
}
