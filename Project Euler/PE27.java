import java.util.Arrays;


public class PE27 {

	public static void main(String[] args) {
	
		int size = 1000;
		boolean[] prime = generatePrimes(size);
		int product = 0; // answer we're looking for
		
		int max = 0; // number of consecutive primes
		int b; // variable in the equation
		
		for (int i=1;i<1000;i+=2) {
			// if it's a prime, use this as your b
			if (prime[i])
			{
				// set b as i;
				b = i;
				for (int a=-1000; a<1000;a++)
				{
					int temp;
					temp = checkMax(a, b, prime);
					if (max < temp)
					{
						max = temp;		
						product = a * b;
					}
				}
			}
		}
		
		System.out.println(product);
	}
	
	private static int checkMax(int a, int b, boolean[] prime)
	{
		int i=0;
		while (isPrime(f(i,a,b)))
		{
			i++;
		}	
		return i;
	}
	
	private static boolean isPrime(int number)
	{
		if (number <= 0)
			return false;
		
		for (int i=2; i<Math.sqrt(number); i++)
			if (number%i == 0)
				return false;
		return true;
	}
	
	private static int f(int x, int a, int b)
	{
		return (x*x + a*x + b);
	}
	
	private static boolean[] generatePrimes(int size)
	{
		boolean[] prime = new boolean[size];
		Arrays.fill(prime, Boolean.TRUE);
		
		prime[0] = false;
		prime[1] = false;
		
		for (int i=2; i<size; i++)
		{
			if (prime[i])
			{
				for (int j = i*2 ; j<size; j += 2)
				{
					if (prime[j])
						prime[j] = false;
				}
			}
		}
		return prime;
	}
}
