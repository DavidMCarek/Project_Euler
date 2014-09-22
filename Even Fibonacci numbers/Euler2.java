
public class Euler2
{

	public static void main(String[] args)
	{	
		// n denotes the nth term in the sequence.
		int nMinusOne = 2;
		int nMinusTwo = 1;
		int n = 0;
		
		// This value is initialized at two because the while loop does not account
		// for the starting nMinusTwo term.
		int sumOfEven = 2;
		
		// This loop finds the nth term then checks if it is even. If it is even
		// its value is added to the sum.
		while (nMinusOne + nMinusTwo <= 4000000)
		{
			n = generateNextTerm(nMinusOne, nMinusTwo, n);
			nMinusTwo = nMinusOne;
			nMinusOne = n;
			sumOfEven = checkIfEven(n, sumOfEven);
		}

		System.out.println(sumOfEven);
	}
	
	public static int generateNextTerm(int nMinusOne, int nMinusTwo, int n)
	{
		n = nMinusOne + nMinusTwo;
		
		return n;
	}

	public static int checkIfEven(int n, int sumOfEven)
	{	
		if (n % 2 == 0)
			sumOfEven += n;
	
		return sumOfEven;
	}
}
