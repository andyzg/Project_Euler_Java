// Written in March 2013
// Problem 4
// By Andy Zhang
public class PE4 {

	public static void main(String args[])
	{
		String number;
		int product;
		int max=0;
		
		for (int i=999;i>700;i--)
		{
			for (int j=999;j>700;j--)
			{
				product=i*j;
				number=Integer.toString(product);
				if (number.length()==6)
				{
					if(number.charAt(0)==number.charAt(5)&&number.charAt(1)==number.charAt(4)&&number.charAt(2)==number.charAt(3)&&product>max)
						max=product;
				}
			}
		}
		System.out.println(max);
	}
}
