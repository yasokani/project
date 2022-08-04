package Shapes;

public class Shape {
	int sq;
	float rect;
	double cir,tri,rhom;
	Shape(){
		
	}
	Shape(int a){
		sq=(a*a);
	}
	Shape(float l, float w){
		
		rect=(l*w);
		
	}
	Shape(double r){
		cir=(3.14*r*r);
	}
	void displaySq(){
		System.out.println("area of square is: " +sq);
	}
	void displayRect(){
		System.out.println("area of rectangle is: " +rect);
	}
	void displayCir(){
		System.out.println("area of circle is: " +cir);
	}
	void area(float l, float b){
		tri=(0.5*l*b);
		System.out.println("area of triangle is: " +tri);
	} 
	void area(double d1, double d2){
		rhom=(0.5*d1*d1*d2*d2);
		System.out.println("area of rhombus is: " +rhom);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Shape(3);
		Shape s2=new Shape(3,3);
		Shape s3=new Shape(8.0f);
		Shape s4=new Shape();
		Shape s5=new Shape();
		s1.displaySq();
		s2.displayRect();
		s3.displayCir();
		s4.area(45.0f,4.0f);
		s5.area(4,5);
		
	}

}
