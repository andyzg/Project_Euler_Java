// Written in March 2013
// Problem 19
// By Andy Zhang
public class PE19 {

	public static void main(String[] args)
	{
		int day = 7; // 1900 first monday
		
		day+=365; // 1901 first day 
		int count=0;
		
		for (int i=1;i<=1200;day+=month(i))
		{
			if (day%7==0)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	
	public static int month(int i)
	{
		int b=i%12;
		
		if (i%48>12&&i%48<=24)
		{
			switch(b)
			{
			case 0:
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				return 31;
			case 1:
				return 29;
			case 3:
			case 5:
			case 8:
			case 10:
				return 30;
			}
		}
		else
		{
		switch(b)
		{
		case 0:
		case 2:
		case 4:
		case 6:
		case 7:
		case 9:
		case 11:
			return 31;
		case 1:
			return 28;
		case 3:
		case 5:
		case 8:
		case 10:
			return 30;
		}
		}
		return 0;
	}
}
