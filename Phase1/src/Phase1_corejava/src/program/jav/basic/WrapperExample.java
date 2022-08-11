package program.jav.basic;

public class WrapperExample {

	public static void main(String[] args) {
		 
		 long i=50L;	
		 int y= 60;
		 
		 float p= 3.5f;
		 double h= 45.67;
		 
		 char c = 'M';
		 boolean t= true;	 
		 
		 int ff= (int)i;  // explicit casting ---> longer range to smaller range
		 long j = y;      // implicit casting ---> smaller range to longer range
		 
		 System.out.println("j" + j + "  " +ff);
		 
		 Integer f1= ff;  // integer primitive ---> Integer object
		 
		 int g = Integer.valueOf(f1);   // Integer object ---> primitive type
		 
		 System.out.println("ff  "+ ff + "   g::" + g);
		 
		 System.out.println(y++);
		 System.out.println(++y);
		 
		 
		 for ( int ii=0 ; ii<5; ii++)
		 {  
			 System.out.println("value of i" +ii);
		 }	
		 
		 int[] numbers = {5,10,15,20,25};
		 for(int u :numbers)  // for each loop
		 {
			 System.out.println("value of array variable" +u);
			 if(u == 20)
				 break;
		 }
		 
		 int kk= 0;
		 while(kk<6)
		 {
			 System.out.println("value of kk" +kk);
			 kk++;
		 }
		 
		 int l=0;
		 do{
			 System.out.println("value of l   : " +l);
		 } while(l<0);
		 
	}

}
