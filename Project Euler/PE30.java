// Written in March 2013
// Problem 30
// By Andy Zhang
public class PE30 {

	public static void main(String[] args)
	{
		int total=0;
		for (int i=2;i<1000000;i++)
		{
			String number = Integer.toString(i);
			int length=number.length();
			int sum=0;
			for (int j=0;j<length;j++)
			{
				int a=Integer.parseInt(Character.toString(number.charAt(j)));
				sum+=(int)Math.pow(a, 5);
			}
			if (sum==i)
			{
				total+=i;
			}
		}
		System.out.println(total);
	}
}
