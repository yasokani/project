package inner_class;

class Employee {
	int salary;
	Employee(int salary){
		this.salary=salary;
	}

	class PerEmp{
		int code;
		
		double hike;
		
		 int salary;
		PerEmp(){
			this.hike=24.5d;
			this.code=5;
			this.salary=Employee.this.salary;
		}
		void new_salary(){
			System.out.println(Employee.this.salary+(Employee.this.salary*this.hike));
			
		
		}
		void display(){
			System.out.println(this.salary+" "+this.code+" "+this.hike);
		}
		}
	
		class TemEmp{
			int code;
			int salary;
			
			double hike;
			TemEmp(){
				this.code=9;
				this.hike=3.9f;
				this.salary=Employee.this.salary;
			}
			void new_salary(){
				System.out.println(Employee.this.salary+(Employee.this.salary*this.hike));
			
			}
			void display(){
				System.out.println(this.salary+" "+this.code+" "+this.hike);
			}
			
			}
		
	void role(){
		class Cont_Emp{
		int code;
		int salary;
		double hike;
		Cont_Emp(){
			this.hike=2.2f;
			this.code=3;
		}
		void new_salary(){
		
		System.out.println(Employee.this.salary+(Employee.this.salary*this.hike));
					}
		void display(){
			System.out.println(this.salary+" "+this.code+" "+this.hike);
		}}
		Cont_Emp p=new Cont_Emp();
p.new_salary();
p.display();
		
	}}
	public class Employee_innerclass {

	public static void main(String[] args) {
		
		Employee b=new Employee(50000);
		Employee.PerEmp q=b.new PerEmp();
q.new_salary();
q.display();

Employee.TemEmp r=b.new TemEmp();

r.new_salary();
r.display();
b.role();

	}}




