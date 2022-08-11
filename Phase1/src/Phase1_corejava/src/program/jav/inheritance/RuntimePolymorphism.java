package program.jav.inheritance;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class RuntimePolymorphism {
	public static void main(String args[]) {

		Bank b; // parent class reference

		b = new SBI(); // 2 --object of SBI CLass
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

		b = new ICICI(); // --object of ICICI CLass
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());

		b = new AXIS(); // --object of AXIS class
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}
}
