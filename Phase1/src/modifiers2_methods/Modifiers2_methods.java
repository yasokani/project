package modifiers2_methods;
public class Modifiers2_methods {

	protected void displayW() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
	public static void main(String[]args){
		Modifiers2_methods f= new Modifiers2_methods();
		
		f.displayW();
		
	}
}