// Written in March 2013
// Problem 23
// By Andy Zhang
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PE23 {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> sum = new ArrayList<Integer>();
		int total=0;
		
		int count=0;
		
		// find all of the abundant numbers and store them in list
		
		for (int i=1;i<28123;i++)
		{
			count=0;
			for (int j=1;j<i/2+1;j++)
			{
				if (i%j==0)
				{
					count+=j;
				}
			}
			if (count>i)
			{
	//			System.out.println(i);
				list.add(i);
			}

		}
		// create a list for all abundant numbers
		int[] abundant = new int[list.size()];
		int a=0;
		
		for (int i=0;i<abundant.length;i++)
		{
			abundant[i]=list.get(i); // insert values into the list
		}
		
		Arrays.sort(abundant); // sort the list to search easily
		
		int index=0;
		boolean found=false;
	//	System.out.println(abundant[0]);
		// find numbers that are sums of abundant
		
		for (int i=0;i<28123;i++)
		{
			index=0;
			found=false;
			if (!(i<abundant[0]))
			{
				do
				{
					a=i-abundant[index];
					if (list.contains(a))
					{
				//		System.out.println(i);
						sum.add(i);
						found=true;
					}
					else
					{
						index++;
					}
					if (abundant[index]>i)
						found=true;
				} while(!found);
			}
		}
		
		
		
		for (int i=0;i<28123;i++)
		{
			if (!sum.contains(i))
			{
				total+=i;
			}
		}
		System.out.println(total);	
	}
	

}
