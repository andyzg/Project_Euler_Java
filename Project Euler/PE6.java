// Written in March 2013
// Problem 6
// By Andy Zhang
public class PE6 {

	public static int SumSquare(int a)
	{
		int total=0;
		
		for (int i=1;i<=a;i++)
		{
			total+=(i*i);
		}
		return total;
	}
	
	public static int SquareSum(int a)
	{
		int total=0;
		
		for (int i=1;i<=a;i++)
		{
			total+=i;
		}
		return total*total;
	}
	public static void main(String args[])
	{
		int input=100;
		System.out.print(SquareSum(input)-SumSquare(input));
	}
}
