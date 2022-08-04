package sequence;

import java.util.Scanner;

public class Sequence {
	 static int seq(int a[], int a_l) {
        int s_a[] = new int[a_l];
        int i, j, max = 0;
        for (i = 0; i < a_l; i++)
        {
        	s_a[i] = 1;
        }
        for (i = 1; i < a_l; i++)
            {
        	for (j = 0; j < i; j++)
        		{
                if (a[i] > a[j] && s_a[i] < s_a[j] + 1)
                    s_a[i] = s_a[j] + 1;
        		}
            }
        for (i = 0; i < a_l; i++)
	 {
        	if (max < s_a[i])
	 
                max = s_a[i];
	 }
        return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a=new int[50];
		  System.out.println("Enter n: ");  
	        @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        
	        System.out.println("Enter the elements of the array: ");
	        for(int i=0; i<n; i++) {

	            a[i]=sc.nextInt();
	        }
	        int a_l = a.length;
	        System.out.println("The length of the longest increasing subsequence is " + seq(a, a_l));
	}

}
