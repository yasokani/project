package program.jav.exceptn;

public class NestedTryDemo {
	
    public static void main(String[] args) {
        try {
        	checkException();  // calling method
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("Finally outside method");
        }
    }
    
    // since method is executed completely thats why first finally statement will 
    // be printed and then it will move to the catch block above
    
    public static void checkException() { // called method
        try {
            int res = 3 / 0;
        } finally {
            System.out.println("Finally inside method");
        }
    }
}
