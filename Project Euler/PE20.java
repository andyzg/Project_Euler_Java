// Written in March 2013
// Problem 20
// By Andy Zhang
public class PE20 {
	
	public static void checkNumber(int[] a)
	{
		for (int j=0;j<a.length;j++)
		{
			do
			{
			if (a[j]>=10)
			{
				a[j]-=10;
				a[j+1]++;
			}
			} while (a[j]>=10);
		}
		return;
	}
	
	public static void multiplyArray(int[] a, int b)
	{
		for (int j=0;j<a.length;j++)
		{
			a[j]*=(b+1);
		}
		return;
	}
	
	public static void main(String[] args)
	{

		int[] number = new int[10000];
		number[0]=1;
		for (int i=0;i<100;i++)
		{
			multiplyArray(number,i);
			checkNumber(number);
		}
		sumArray(number);
	}
	
	public static void sumArray(int[] a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i];
		//	System.out.println(a[i]);
		}
		System.out.print(sum);
	}
	
}
