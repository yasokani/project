package program.jav.inheritance;

class Student{  
	int rollno=9;  
	String name="kj";  
	float fee=9.8f;  
	
	Student(int rollno,String name,float fee){  
	this.rollno=rollno;  // check output and then put this.rollno=rollno; // this.name=name; // this.fee=fee;
	this.name=name;  
	this.fee=fee;  
	}  
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
	
public class ThisKeyword{  
	public static void main(String args[]){  
		
	Student s1=new Student(111,"ankit",5000f);  
	Student s2=new Student(112,"sumit",6000f);  
	
	s1.display();  
	s2.display();  
	}
}  