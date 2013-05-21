// Written in March 2013
// Problem 14
// By Andy Zhang
public class PE14 {

	public static void main(String[] args)
	{
		int count=0;
		long number=2L;
		long temp=0L;
		long max=0;
		int maxcount=0;
		
		do
		{
			count=1;
			temp=number;
			while (temp!=1)
			{
			if (temp%2==1)
			{
				temp=3*temp+1;
				count++;
			}
			else if (temp%2==0)
			{
				temp=temp/2;
				count++;
			}
			}
			if (maxcount<count)
				{
				maxcount=count;
				max=number;
				}
			number++;
		} while (number<=1000000);
		System.out.println(max);
	}
}
