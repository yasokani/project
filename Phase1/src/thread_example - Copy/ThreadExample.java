package thread_example;

public class ThreadExample extends Thread {
	public void run(){  
		  System.out.println("Thread is running...");  
		}  
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			ThreadExample t1=new ThreadExample();  
			t1.start();                            
	}

}
