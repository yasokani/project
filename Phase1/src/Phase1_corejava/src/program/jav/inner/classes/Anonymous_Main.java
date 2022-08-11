package program.jav.inner.classes;

//Java program to demonstrate need for Anonymous Inner class
interface Age
{
	int x = 21;
	void getAge();
}
public class Anonymous_Main
{
	public static void main(String[] args)
	{
		// Myclass is implementation class of Age interface
		MyClass obj=new MyClass();

		// calling getage() method implemented at Myclass
		obj.getAge();	
	}
}

//Myclass implement the methods of Age Interface
class MyClass implements Age
{
	@Override
	public void getAge()
	{
		// printing the age
		System.out.print("Age is "+x);
	}
}

// what is the use of creating two classes above ?
/* Here, an object to Age is not created but an object of Myclass is created and copied in the entire class code as shown above.
 * This is possible only with anonymous inner class. Such a class is called ‘anonymous inner class’, so here we call ‘Myclass’ 
 * as anonymous inner class.

public class Anonymous_Main
{
    public static void main(String[] args) {
  
        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it 
        // is created.
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                 // printing  age
                System.out.print("Age is "+x);
            }
        };
        oj1.getAge();
    }
}
 */

