package students;

public class Students {
int s1,s2,s3;
String name;
int age;
char section;
char gender;

int total;
double percent;
public Students(){s1=0;}
public Students(String name,int age,char section,char gender,int s1,int s2,int s3){
	this.age=age;
	this.name=name;
	this.section=section;
	this.gender=gender;
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
}
public Students(String name,int age,char section,char gender,int s2,int s3)
{
	this.age=age;
	this.name=name;
	this.section=section;
	this.gender=gender;
	this.s2=s2;
	this.s3=s3;
}
public int total()
{
	total=this.s1+this.s2+this.s3;
	return total;
}
public double percent(){
	percent=((this.s1+this.s2+this.s3)/300)*100;
	return percent;
}
public void display()
{
	System.out.println("Student details:"+this. name+" "+this.age+" "+this.section+" "+this.gender);
	System.out.println("total marks:"+total());
	System.out.println("total marks:"+percent());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students ob=new Students("Kanimozhi",21,'D','F',89,80,90);
Students obj=new Students("Thenmozhi",24,'D','F',99,80);
Students obje=new Students("Mythili",22,'G','F',89,88,90);
Students objec=new Students("Praveen",19,'D','M',89,60);

ob.display();
obj.display();
obje.display();
objec.display();
	}

}
