package program.jav.basic;

public class ForEachExample {

	   public static void main(String[] args) {
	      double[] myList = {1.9, 2.9, 3.4, 3.5}; //array of double
	      
	      for(int i=0;i<4; i++)
	      {
	    	  System.out.println(myList[i]);
	      }

	      // Print all the array elements
	      for (double element: myList) {
	         System.out.println(element);
	      }
	      
	      for(int i =0; i<10; i++){
				if(i==5)
				{
					break;
				}
				System.out.println(i);
			}
	   }
	}