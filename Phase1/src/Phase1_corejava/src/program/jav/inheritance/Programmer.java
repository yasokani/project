package program.jav.inheritance;

class Employee{  
	 float salary=40000;  
	 int bonus= 5600;
	 
	 public void show(){
		 System.out.println("inside the parent classs");
	 } 
}  


public class Programmer extends Employee{  

	//salary = 40000 and show()
	
	 int bonus=10000; 
	 
	 public void show(){
		 System.out.println("Bonus of Employee is:"+super.bonus);
		 System.out.println("inside the child classs");
	 }
	 
	 public static void main(String args[])
	 {  
	   Programmer p=new Programmer();  
	   
	   System.out.println("Programmer salary is:"+p.salary);    
	   System.out.println("Bonus of Programmer is: is:"+p.bonus); 
	   p.show();
	}  
	 
}  
