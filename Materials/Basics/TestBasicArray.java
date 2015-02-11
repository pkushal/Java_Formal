


public class TestBasicArray {

	public static void main(String args[]) {
		//Declaring an Array which can store 5 elemenets (Integer Values)
		int a[] = new int[8]; //int a[5];
		a[0] = 3;
		a[1] = 6;
		a[2] = 3;
		a[3] = 1;
		a[4] = 6;
		a[5] = 3;
		a[6] = 4;
		a[7] = 100;
				 //[0][1].....	
		//int b[] = {11,22,44,55,66,77,88};
		
		System.out.println("Length of Integer Array is : " + a.length);
		//First Loop, i = 0, i=1
		for(int i=0; i<a.length; i ++) {
			System.out.println("Value = " + a[i]); //a[0], a[1]....
		}
		System.out.println("Value of Array with Index 5 is " + a[5]);
		
		/*
		float f1[] = new float[3];
		System.out.println("Length of Float Array is : " + f1.length);
		
		f1[0] = 100.5f;
		f1[1] = 20.2f;
		f1[2] = 30.1f;
		
		//First Loop, i = 0, i=1
		for(int i=0; i<f1.length; i++) {
			System.out.println("Value = " + f1[i]); //a[0], a[1]....
		}
		System.out.println("Value of Array with Index 2 is " + f1[2]);
	*/
	
	}
}
