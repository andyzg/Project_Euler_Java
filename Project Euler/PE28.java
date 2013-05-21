// Written in March 2013
// Problem 28
// By Andy Zhang
public class PE28 {

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		int sum=1;
		
		for (int i=1;i<=500;i++)
		{
			sum+=((2*i)*(2*i+1)+1);
			sum+=((2*i)*(2*i)+1);
			sum+=((2*i)*(2*i-1)+1);
			sum+=((2*i+1)*(2*i+1));
		}
		System.out.println(sum);
	}
}
