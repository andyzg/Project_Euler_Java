// Written in March 2013, rewritten in May 2013
// Problem 5
// By Andy Zhang
public class PE5 {

	public static void main(String args[])
	{	
		int[][] primes = new int[20][2];
		int sum=1;
		
		for (int i=2;i<=20;i++)
		{
			int dummy=i;
			do
			{
				for (int j=2;j<=20;j++)
				{
					if (dummy%j==0)
					{
						dummy/=j;
						primes[j-1][1]++;
						break;
					}
				}
			} while (dummy!=1);
			
			for (int j=0;j<20;j++)
			{
				if (primes[j][1]>primes[j][0])
				{
					primes[j][0]=primes[j][1];
				}
				primes[j][1]=0;
			}
		}
		
		for (int i=0;i<20;i++)
		{
			sum*=(int)Math.pow((double)(i+1), (double)primes[i][0]);
		}
		System.out.println(sum);
	}
}
