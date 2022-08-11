package program.jav.exceptn;

import java.io.*;  

class Parent{  
  void msg()
  {
	  System.out.println("parent");
  }  
}  
  
class TestExceptionChild extends Parent{  
 
	void msg() throws ArithmeticException{             //change to void msg() throws IOException
    System.out.println("TestExceptionChild");  
  }  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild();  
   p.msg();  
  }  
}  

//*** Rules***//
// 1. If the superclass method does not declare an exception, subclass overridden method 
//    cannot declare the checked exception but can declare unchecked/ru exception.

// 2. If the superclass method does not declare an exception, subclass overridden method
//    cannot declare the checked exception.

// 3. If the superclass method declares an exception, subclass overridden method can 
//    declare same, subclass exception or no exception but cannot declare parent exception.