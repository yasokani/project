package program.jav.inheritance;

public class checkPrimeNumber {
	
	checkPrimeNumber(){
		System.out.println("Default constructor");
	}
	
	public void checkPrime(int num){
		boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

	public static void main(String[] args) {

		checkPrimeNumber obj = new checkPrimeNumber();
		obj.checkPrime(11);
	}

}
