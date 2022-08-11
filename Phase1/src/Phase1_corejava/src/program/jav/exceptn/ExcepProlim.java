package program.jav.exceptn;

public class ExcepProlim {

	public static void main(String[] args) {
		
		try{
					
			int ar[] = new int[4];
			ar[5] = 9;
			int a = 6/0;
	
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage()); 
			System.out.println("i cant divide by zero");
		}
		 
		finally{
			System.out.println("always");
		}
		
		

	}

}
