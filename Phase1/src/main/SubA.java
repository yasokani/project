package main;


 class Product {
int id=43;
String name="Anjali";
void display()
{
	System.out.println("Prooduct id:"+" "+ id+"and name"+ " "+name);
	System.out.println();
}}
class A extends Product{
	int count=50;
	String cat="Butter";
	void displayA()
	{
		System.out.println("Prooduct id:"+" "+ id+"and name"+ " "+name);
		System.out.println("A count:"+" "+ count+" "+"and category"+ " "+cat);
		
	}}
public class SubA extends A{
	int price=30;
	int total;
	
	
void displaysubA()
{
total=price*count;
System.out.println();
System.out.println("Prooduct id:"+" "+ id+"and name"+ " "+name);
System.out.println("A count:"+" "+ count+"and category"+ " "+cat);
System.out.println("SubA price:"+" "+price+" "+total );


}
public static void main(String []args){
	SubA r=new SubA();
	r.display();
	r.displayA();
	r.displaysubA();
	SubB d=new SubB();
	
	d.displayB();
	d.displaysubB();
	C f=new C();
	f.displayC();
}
}
class B extends Product{
	int count= 90;
	String cat="Milk";
	void displayB(){
		System.out.println();
		System.out.println("Prooduct id:"+" "+ id+"and name"+ " "+name);
		System.out.println("B-> count:"+" "+ count+"and category"+ " "+cat);
	}}
	class SubB extends B{
		int price=10;
		int total;
		void displaysubB(){
			total=price-count;
			System.out.println();
			System.out.println("Prooduct id:"+" "+ id+"and name"+ " "+name);
			System.out.println("B-> count:"+" "+ count+"and category"+ " "+cat);
			System.out.println("SubB ->price:"+" "+price+" "+total );
		}
		
	}
	class C extends Product{
		int count=56;
		String cat=" Curd";
		void displayC(){
			System.out.println();
			System.out.println("Prooduct id:"+" "+ id+"and name"+ " "+name);
			System.out.println("C-> count:"+" "+ count+"and cat"+ " "+cat);
		}
	}
	

	



	


	