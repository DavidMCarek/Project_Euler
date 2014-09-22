
public class Euler3
{

	public static void main(String[] args)
	{
		long number = 600851475143L;
		boolean isPrime = false;
		int largestPrime = 1;
		
		// A property for finding primes allows us to only have to go up to the
		// square root of the number when checking for primes. This applies later in 
		// the method as well.
		for (int checkNumber = 2; checkNumber <= Math.sqrt(number); checkNumber ++)
		{
			isPrime = false;
			
			// This means check number is a multiple of number.
			if (number % checkNumber == 0)
				isPrime = checkIfPrime(isPrime, checkNumber);
			
			// If the new found prime is larger than the old one it will
			// replace it.
			if (isPrime && (largestPrime < checkNumber))
				largestPrime = checkNumber;
		}
		
		System.out.println(largestPrime);
	}

	public static boolean checkIfPrime(boolean isPrime, int checkNumber)
	{
		for (int count = 2; count <= Math.sqrt(checkNumber); count++)
		{
			// If the check number is divisible by anything anything other than 
			// one or itself it will be marked as not prime.
			if (checkNumber % count == 0)
				return false;
		}
		return true;
	}
}
