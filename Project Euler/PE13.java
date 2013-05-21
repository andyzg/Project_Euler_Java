// Written in March 2013
// Problem 13
// By Andy Zhang
import java.util.*;

public class PE13 {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String[] input = new String[100];
		int[][] answer = new int[100][50];
		long[] sums = new long[50];
		long total=0;
		
		for (int i=0;i<100;i++)
		{
			input[i]=scan.next();
		}
		
		for (int i=0;i<100;i++)
		{
			for (int j=0;j<50;j++)
				{
					answer[i][j]=Integer.parseInt((Character.toString(input[i].charAt(j))));
				}
			
		}
		
		for (int i=0;i<50;i++)
		{
			for (int j=0;j<100;j++)
			{
				sums[i]+=answer[j][i];
			}
		}
		
		for (int i=0;i<13;i++)
		{
			sums[i]=(long) (sums[i]*Math.pow(10, 12-i));
		}
		
		for (int i=0;i<13;i++)
		{
			total+=(long)sums[i];
		}
		
		System.out.println(total/100000);
	}
}
