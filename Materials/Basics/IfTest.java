


public class IfTest {
	/*
	 * Type:1
	 * 	if (condition is true) 
	 * 	{
	 * 		execute this statement
	 * 	}
	 * 
	 * Type:2
	 * if (condition is true) 
	 * {
	 * 		execute statement1
	 * } else {
	 * 		execute statement2
	 * }
	 * 
	 * Type:3
	 * 
	 * if (condition is true) 
	 * {
	 * 		execute statement1
	 * } else if (condition2 is true) { 
	 * 		execute statement2
	 * } else if (condition3 is true) {
	 * 		execute statement2
	 * } else {
	 * 		execute statement2
	 * }
	 * 
	 */
	   public static void main(String args[]){
		      int x =-1;
		      
		      if (x > 0) 
		      {
		    	  System.out.println("This is a valid value");
		      } else if (x == 0) {
		    	  System.out.println("Value is ZERO, please enter another value");
		      } else {
		    	  System.out.println("Unknown value");
		      }
		      
		      
		      if (x == 1000) {
		    	  System.out.println("X value is 100");
		      } else {
		    	  System.out.println("X value is not 100");
		      }

		      
		      if ( x == 10 ) 
		      {
		         System.out.print("Value of X is 10");
		      } else if (x == 30) {
		    	  System.out.print("Value of X is 30");
		      } else if(x == 40) {
		    	  System.out.println("Value of X is 40");
		      } else {
		    	  System.out.println("Nothing Matches");
		      }
		      
		   }
		   
}
