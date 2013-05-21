// Written in March 2013
// Problem 12
// By Andy Zhang
public class PE12 {

	public static void main(String[] args)
	{
		int dum=0;
		int count=1;
		int factor=0;
		boolean test = true;
		
		
		do 
		{
			dum+=count;
			factor=0;
			for (int i=1;i<=Math.sqrt(dum);i++)
			{
				if (dum%i==0)
				{
					factor++;
				}
			}
			
			if (factor>=250)
			{
				test=false;
			}
			count++;
		} while (test);
		
		System.out.print(dum);
	}
}
