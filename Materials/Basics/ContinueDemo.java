


public class ContinueDemo {
	   public static void main(String args[]) {
		      int numbers[] = {10, 20, 30, 40, 50};

		      for(int i=0; i<numbers.length; i++ ) {
		         if( numbers[i] == 30 ) {
			      continue; //this will go back to the loop. this will ignore the statement below
		         }
		         System.out.println( numbers[i] );
		        //System.out.print("\n");
		      }
		   }
}
