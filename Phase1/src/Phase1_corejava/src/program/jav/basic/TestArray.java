package program.jav.basic;

public class TestArray {

	   public static void main(String[] args) {
	      
		  double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " " +i);
	      }
	      
	      int ar[] = new int[4]; //integer array - 4 elements
	      int size = ar.length;
	      System.out.println("size of array is :" + size);
	      //System.out.println("fifth:" + ar[5]);
	      
	     
	      // Summing all elements
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      
	      
	      // Finding the largest element
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) 
	        	 {
	        	    max = myList[i];
	        	 }
	      }
	      System.out.println("Max is " + max);  
	   }
	   
	   
	}