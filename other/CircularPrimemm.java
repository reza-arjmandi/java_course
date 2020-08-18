package lab10;


public class CircularPrimemm {

	public static void main (String [] args) {
		
		System.out.println(circularPrime(400));
	}
	
	
	static int circularPrime (int number) {
		
		int numberOfCircularPrimeNumbers = 0;
		for(int i=2; i<=number; i++) {
			if(!containsZero(i) && isPrime(i)) {
				if(isCircularPrime(i)) {
					numberOfCircularPrimeNumbers++;
				}
			}
		}
		return numberOfCircularPrimeNumbers;
	}
	
	
	static boolean isPrime(int number) {
		
		boolean isPrime = true;
		if(number==0 || number==1) {
			isPrime = false;
		}
		for(int i=2; i<=number; i++) {
			if(number%i==0 && i!=number ) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	
	static boolean containsZero (int number) {
		
	   String num = number + "";
	   if(num.contains("0")) {
		   return true;
	    }else {
	    	return false;
	    }
	}
	
	
	static boolean isCircularPrime (int number) { //113
	
		int num = number;
		int numberDigits = numberOfDigits(number);
		while(isPrime(num)) {
		  int rem = num%10; //13
		  int div = num/10; //1
		  num = (int)Math.pow(10,numberDigits-1)*rem +div;
		  if(num == number) {
		    return true;
		  }
		}
		return false;
	}
	
	
	static int numberOfDigits (int number) {
		
		int count=0;
		while(number>0) {
			count++;
			number = number/10;
		}
		return count;
	}
}

	