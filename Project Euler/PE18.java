// Written in March 2013
// Problem 18
// By Andy Zhang
import java.util.*;

public class PE18 {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	int[][] numbers = new int[15][15];
	int dum=0;
	
	//Initialize the whole triangle
	for (int i=0;i<numbers.length;i++)
	{
		for (int j=0;j<=i;j++)
		{
			numbers[i][j]=scan.nextInt();
		}
	}
	
	for (int i=numbers.length-1;i>=1;i--)
	{
		dum=0;
		do
		{
			if (numbers[i][dum]>numbers[i][dum+1])
			{
				numbers[i-1][dum]=numbers[i-1][dum]+numbers[i][dum];
			}
			else
			{
				numbers[i-1][dum]=numbers[i-1][dum]+numbers[i][dum+1];
			}
			dum++;
		} while(dum<i);
	}
	System.out.println(numbers[0][0]);
	}
}
