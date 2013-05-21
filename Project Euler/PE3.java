// Written in March 2013
// Problem 3
// By Andy Zhang
public class PE3 {

	public static void main(String[] args)
	{
		long prime=600851475143L;
		
		int max_factor=0;
		do {
			for (int i=2;i<=prime;i++)
			{
				if (prime%i==0)
				{
					prime=prime/i;
					if (i>max_factor)
						max_factor=i;
					break;
				}
			}
		} while (prime!=1); // keep on dividing and finding all of the factors until prime=1
		System.out.println(max_factor);
	}
}
