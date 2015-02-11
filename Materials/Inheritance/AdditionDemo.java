
public class AdditionDemo {

	public static void main(String[] args) {
		
		Addition ob = new Addition(100, 200);
		//The Values 100 and 200 are getting passed when the Object is getting created.
		
		//ob.a = 100;
		//ob.b = 200;
		int sum = ob.add();
		int diff = ob.subtraction();
		System.out.println("The sum of " + ob.firstValue + " and " + ob.secondValue + " = " + sum);
		System.out.println("The Diff of " + ob.firstValue + " and " + ob.secondValue + " = " + diff);
	}
}
