package modifiers_method;
class privateaccess 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 
class defaultaccess
{ 
  void displayA() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

class publicaccess {

	public void displayN() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}
public class Modifiers_method {

	public static void main(String[] args) {
		
		privateaccess  obj = new privateaccess();
		defaultaccess h=new defaultaccess();
		publicaccess y=new publicaccess();
       //obj.display();
        h.displayA();
        y.displayN();

	}
}

		
		

		 