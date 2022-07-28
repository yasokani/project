package abstraction;


	

/*Vechile:(Parent)- abstract
	- create two abstract methods  - run() and stop()
	- create three methods of public void fuel - 1st method will take int / 2nd method will float and string  / 
	3rd method will take char and int (method overloading)
	- declare two variables - int speed and long distance
	- create two constructors also- default and parametrized
	2W:(child)
	- oveeride the two methods - run() and stop()
	- create default constructor
	- declare two variables - int speed and long distance with different values from the parent vechile
	- decalre one more variable as int nos_of_tyre = 2
	- create methods here also as display() --> this will print the three variables of 2W  +
	 all the variable of the parent Vechile  (hint: super.variable_name)
	*/ 
	abstract class parent{
		int speed=9;
		long distance=5238;
		parent(){
			System.out.println(" Default parent constructor");
			
		}
		parent(int b,String c){
			System.out.println(" Parameterized parent constructor");
			
		}
		abstract void run();
		abstract void stop();
		public void fuel(int a){
			System.out.println(a);
		}
		public void fuel(float b,String c){
			System.out.println(b+" "+c);
			
			}
		public void fuel(char S, int d){
			System.out.println(S+" "+d);
			
			
		}
		
			
		}
	/*2W:(child)
	- oveeride the two methods - run() and stop()
	- create default constructor
	- declare two variables - int speed and long distance with different values from the parent vechile
	- decalre one more variable as int nos_of_tyre = 2
	- create methods here also as display() --> this will print the three variables of 2W  +
	 all the variable of the parent Vechile  (hint: super.variable_name)
	*/ 
	public class Twowheeler extends parent {

		Twowheeler(){
			super(3,"Hello");
			System.out.println("Child Default constructor");
		}
		int speed=4;
		long distance=3864;
		int no_tyre=2;
		void display(){
			System.out.println(speed+" "+ distance+" "+no_tyre+" "+super.speed+" "+super.distance);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Twowheeler d=new Twowheeler();
	d.display();
	 d.fuel(5);
	 d.fuel(8.0f,"Kanimozhi");
	 d.fuel('M',3);
	//parent s=new Twowheeler();
	 
	 //s.parent(4,"Hii");
		}

		
		@Override
		void run() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void stop() {
			// TODO Auto-generated method stub
			
		}

	}


