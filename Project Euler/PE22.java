// Written in March 2013
// Problem 22
// By Andy Zhang

import java.util.*;

public class PE22 {

	public static void main(String args[]){
		String[] list = new String[5163];
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[\",]+");
		int[] sum = new int[list.length];
		long total=0L;
		
		for (int i=0;i<list.length;i++)
		{
			list[i]=scan.next();
		}

		Arrays.sort(list);
		
		for (int i=0;i<list.length;i++)
		{
	//		System.out.println(list[i]);
		}
		for (int i=0;i<list.length;i++)
		{
			for (int j=0;j<list[i].length();j++)
			{
				sum[i]+=(list[i].charAt(j)-64);
		//		System.out.println((int)list[i].charAt(j)-64);
			}
			sum[i]=sum[i]*(i+1);
		}
		
		for (int i=0;i<list.length;i++)
		{
			total+=(long)sum[i];
		}
	//	System.out.println(list[937]);
	//	System.out.println(sum[937]);
		System.out.println(total);
	}
}
