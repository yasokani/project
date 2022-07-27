package abstraction;

abstract class MNC{
MNC(){
System.out.println("MNC constructor");
}
void display(){
System.out.println("MNC display");}
abstract void wipro();

abstract void tcs();


}
abstract class infosys extends MNC{
void wipro(){
System.out.println("MNC-Wipro");
}
void displayQ(){
System.out.println("Infosys-tcs");}
abstract void tcs();
}


public class Hello extends infosys{
void displayM(){
System.out.println("Hello");}
void tcs(){
System.out.println("MNC-tcs");

}
public static void main(String[]args){
Hello a=new Hello();
a.display();
a.displayQ();
a.displayM();
}

}


	
