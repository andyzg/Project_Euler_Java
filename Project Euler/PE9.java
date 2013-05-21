// Written in March 2013
// Problem 9
// By Andy Zhang
public class PE9 {

	public static void main(String[] args)
	{
		int l;
		int j;
		for (int i=1;i<1000;i++)
		{
			j = (500000-1000*i) / (1000-i);
			l = 1000 - j - i;
			if (i*i+j*j-l*l==0)
			{
				System.out.print(i*j*l);
				break;
			}
			
		}
	}
}
