// Written in March 2013
// Problem 16
// By Andy Zhang
public class PE16 {

	public static void main(String[] args)
	{

		int[] number = new int[1000];
		number[0]=1;
		for (int i=0;i<1000;i++)
		{
			multiplyArray(number);
			checkNumber(number);
		}
		sumArray(number);
	}
	
	public static void multiplyArray(int[] a)
	{
		for (int j=0;j<a.length;j++)
		{
			a[j]*=2;
		}
		return;
	}
	
	public static void checkNumber(int[] a)
	{
		for (int j=0;j<a.length;j++)
		{
			if (a[j]>=10)
			{
				a[j]-=10;
				a[j+1]++;
			}
		}
		return;
	}
	
	public static void sumArray(int[] a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.print(sum);
	}
}
