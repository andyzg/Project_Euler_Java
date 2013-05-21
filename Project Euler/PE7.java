// Written in March 2013
// Problem 7
// By Andy Zhang
public class PE7 {

	public static void main(String[] args)
	{
		int count=0;
		int prime=1;
		boolean prime_number;
		
		do 
		{
			prime_number=true;
			prime++;
			for (int i=2;i<prime;i++)
			{
				if (prime%i==0)
				{
					prime_number=false;
					break;
				}
			}
			if (prime_number)
				count++;

		} while(count!=10001);
		System.out.print(prime);
	}
}
