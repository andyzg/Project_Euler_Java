// Written in March 2013
// Problem 21
// By Andy Zhang

import java.util.ArrayList;
import java.util.List;

public class PE21 {

	public static void main(String[] args)
	{
		int sum=0;
		int ssum=0;
		int amic=0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i=2;i<10000;i++)
		{
			if (list.contains(i))
			{}
			else
			{
				for (int j=1;j<i;j++)
				{
					if (i%j==0)
						sum+=j; // add it to find the amicable number
				}
				for (int j=1;j<sum;j++)
				{
					if (sum%j==0)
						ssum+=j; // add it to the other number
				}
				if (i==ssum&&sum!=ssum)
				{
					list.add(sum);
					list.add(ssum);
		//			System.out.println(sum);
		//			System.out.println(ssum);
				}
				sum=0;
				ssum=0;
			}
		}
		
		for (int i=0;i<list.size();i++)
		{
			amic+=list.get(i);
		}
		System.out.println(amic);
	}

}
