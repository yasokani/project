package collection;
/*LinkedHashSet (L1 & L2)
L1  - 1st object will be generic ( add two int, two float ,two char, one boolean)
L2  - 2nd object will be be Integer type only and take four different
 random numbers from user console.*/


import java.util.*;


public class Collection_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(2+3);
		lhs.add(2.9f+2.0f);
		lhs.add('d'+'f');
		lhs.add(true);
		int[] c=new int[4];
		int r=0;
		System.out.println("The addition of linked hash set 1 contains:"+lhs);
		LinkedHashSet<Integer> lhs2=new LinkedHashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four numbers:");
		for (int i=0;i<4;i++)
		{
			c[i]=sc.nextInt();
			
		}
		for (int i=0;i<4;i++)
		{
			 r=c[0]+c[1]+c[2]+c[3];
			
		}
		System.out.println("The addition of four numbers is:"+r);
		
		
		
		
	}

}
