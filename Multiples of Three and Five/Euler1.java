
public class Euler1
{

	public static void main(String[] args)
	{
		// First we need a variable to hold the sum.
		int sumOfMultiples = 0;
		
		//Next we will count form 0 to 999
		for (int count = 0; count < 1000; count++)
		{
			// If the count is a multiple of 3 or 5 it will be added to the
			// sum of the multiples.
			if ((count % 3 == 0)||(count % 5 == 0))
				sumOfMultiples += count;
		}
		System.out.println("The sum of the multiples of 3 & 5 is: " + sumOfMultiples);
	}
}
