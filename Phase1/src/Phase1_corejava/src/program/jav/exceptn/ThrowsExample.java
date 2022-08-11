package program.jav.exceptn;

import java.io.IOException;  

public class ThrowsExample{  
	
  void m() throws IOException{  
    throw new IOException("device error"); //checked exception  
  }  
  
  void n() throws IOException{  
    m();    // it doesnot have catch block so it will move to p() calling method with 
            // exception propogation
  }  
  
  void p(){  
   try{  
    n();  
   }
   catch(Exception e)
   {
	   System.out.println("exception handled");
	   System.out.println(e.getMessage());
	   System.out.println(e.getStackTrace());
	   System.out.println(e.getClass());
   }  
  }  
  
  public static void main(String args[]){  
	   ThrowsExample obj=new ThrowsExample();  
	   obj.p();  
	   System.out.println("normal flow...");  
  }  
  
}  
