// Written in March 2013
// Problem 26
// By Andy Zhang
public class PE26 {

	public static void main(String[] args)
	{
		int max=0;
		int a;
		int count=0;
		
		for (int i=101;i<=1000;i+=2)
		{
			a=i;

			if (a%5!=0)
			{
			count=0;
			int ten=1000;

			do
			{
				ten=ten%a;
				ten*=10;
				count++;
			} while (ten!=1000);
			if (max<count)
			{
				max=a;
			}
			}

		}
		System.out.println(max);
	}
}
