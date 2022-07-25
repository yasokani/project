package string;

public class String {

	public String(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String t= "Delhi";    
		java.lang.String o = "Mumbai"; 
		java.lang.String k= "delhi";   
		String y= new String ("Mumbai");    
		String l= new String ("delhi");     
		String p = new String("Hello");   
		if (o.equals(l)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		if (y.equals(p)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		if (t.equals(o)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		if (k.equals(y)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		if (p.equals(y)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

}
