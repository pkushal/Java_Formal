


public class VariableBasic {

	public static void main(String[] args) {
		
		int x = 20;
		char ch = 'A';
		double amount = 40.2; //8 bytes
		float f1 = 20.3f; //4 bytes
		boolean bool = true;
		
		float f2=5; //Storing int(4bytes) to float (4 bytes) variable
		
		//System.out.println(x);
		
		double sum = x + amount;
		
		System.out.println("Below are the output..");
		System.out.println("Integer value is =" + x); //The '+' operator is used as a concat operator
		//The '+' operator is overloaded (ie, it behaves as Airt Operator and Concat Operator)
		System.out.println("Character = " + ch);
		System.out.println("Double= " + amount);
		System.out.println("Float= " + f1);
		System.out.println("Boolean = " + bool);
		System.out.println("The sum is = " + sum);
		
	
	}
}
