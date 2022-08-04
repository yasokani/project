package thread_example;
class Cust{  
int amount=10000;  
  
	synchronized void withdraw(int amount){  
	System.out.println("In withdraw state");  
	  
		if(this.amount<amount)
		{  
		System.out.println("Low balance and hence need to wait until deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("Hureh!!Withdraw completed and remaining amount is:"+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("In deposit stage!");  
		this.amount+=amount;  
		
		System.out.println("Good to go! Deposit completed... " + this.amount);  
		notify();  //unlocking of thread
	}  
}  
  
public class Wait_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Cust c=new Cust();  
		
		new Thread(){                 // anonymous class
		  public void run()
		  {
			c.withdraw(5000);
		  }  
		}.start();  
		new Thread(){                 // anonymous class
			  public void run()
			  {
				c.withdraw(4000);
			  }  
			}.start();  
			new Thread(){                 // anonymous class
				  public void run()
				  {
					c.withdraw(10000);
				  }  
				}.start();  
		
		new Thread(){  
		  public void run()
		   {
			 c.deposit(20000);
		   }  
		}.start();    
	}

}
