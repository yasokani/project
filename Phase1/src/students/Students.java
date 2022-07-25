package students;

public class Students {
String name;
char section, gender;
int s1,s2,s3,age;
Students(){
	s1=0;
}
Students(String name,char section, char gender,int age,int s1,int s2,int s3){
	
	this.name=name;
	this.age=age;
	this.gender=gender;
	this. section=section;
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	
}
Students(String name,char section, char gender,int age,int s2,int s3){
	
	this.name=name;
	this.age=age;
	this.gender=gender;
	this. section=section;

	this.s2=s2;
	this.s3=s3;
	
}
int total(){
	return this.s1+this.s2+this.s3;
}
double percent(){
	return ((this.s1+this.s2+this.s3)/300)*100;
}
void display()
{
	System.out.println("Student details are:"+this.name+" "+this.age+" "+this.section+" "+this.gender);
	System.out.println("Student mark is"+this.s1+" "+this.s2+" "+this.s3+" "+total()+percent());
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students ob=new Students("Kanimozhi",'B','F',21,99,100,100);
Students obj=new Students("Thenmozhi",'B','F',23,100,100);
Students obje=new Students("Mythili",'A','F',21,95,100,100);
Students objec=new Students("Praveen",'B','M',19,100,100);
ob.display();
obj.display();
obje.display();
objec.display();


	}

}
