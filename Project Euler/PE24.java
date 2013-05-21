// Written in March 2013
// Problem 24
// By Andy Zhang
import java.util.ArrayList;
import java.util.List;

public class PE24
{
	public static int factorial(int a)
	{
		int total=1;
		for (int i=1;i<=a;i++)
		{
			total*=i;
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		double startTime = System.nanoTime();
		
		int[] list = new int[10];
		int number=999999;
		
		for (int i=0;i<list.length;i++)
		{
			list[i]=number/factorial(9-i);
			number=number%factorial(9-i);
		}
	/*	for (int i=0;i<list.length;i++)
		{
			System.out.print(list[i]);
		}*/
		
		List<Integer> index = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++)
		{
			index.add(i);
		}
		
		for (int i=0;i<10;i++)
		{
			int a=index.get(list[i]);
			System.out.print(a);
			index.remove(list[i]);
		}
		System.out.println();
		//double endTime   = System.nanoTime();
		//double totalTime = endTime - startTime;
		//System.out.println(totalTime/1000000000);
		//System.out.println(endTime);
		
	}
}