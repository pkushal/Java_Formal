
public class OverloadDemo {

	public static void main(String[] args) {
		MathOperations ob = new MathOperations();
		double sum = ob.add(10, 20.5);
		System.out.println("Sum = " + sum);
		
		int sum3 = ob.add(10, 20, 30);
		System.out.println("Sum of 3 Nos = " + sum3);
		
		int sum4 = ob.add(10, 20, 30, 40);
		System.out.println("Sum of 4 Nos = " + sum4);
	}
}
