// Written in March 2013
// Problem 10
// By Andy Zhang
import java.util.ArrayList;

public class PE10 {

	public static void main(String[] args)
	{
		long sum=0;
		int count=3;
		int factor=0;
		boolean test=true;
		int[] prime = new int[999999];
		
		prime[0]=2;
		int arraysize=1;
		
		do {
			test=true;
			factor=0;
			for (int i=0;i<arraysize;i++) // Checking if number is factorable by a prime number in array
				{
				if (count%prime[i]==0)
				{
					test=false;
					break;
				}
				}
			if (test) // Not factorable, add it to array
			{
				prime[arraysize]=count;
				arraysize++;
			}
			count+=2;
		} while(count<2000000);
		
		for (int j=0;j<arraysize;j++)
		{
			sum+=(long)prime[j];
		}
		System.out.println(sum);
	}
}
