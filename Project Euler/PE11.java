// Written in March 2013
// Problem 11
// By Andy Zhang
import java.util.*;

public class PE11 {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int[][] input = new int[20][20];
		int max=0;
		int dum=0;

		
		for (int i=0;i<20;i++)
		{
			for (int j=0;j<20;j++)
			{
				input[i][j]=scan.nextInt();
			}
		}
	
		
		for (int i=0;i<16;i++)
		{
			for (int j=0;j<16;j++)
			{
				dum = input[i][j]*input[i][j+1]*input[i][j+2]*input[i][j+3];
				if (dum>max)
					max=dum;
			}
		}
		
		for (int j=0;j<16;j++)
		{
			for (int i=0;i<16;i++)
			{
				dum = input[i][j]*input[i+1][j]*input[i+2][j]*input[i+3][j];
				if (dum>max)
					max=dum;
			}
		}
		
		for (int i=0;i<=16;i++)
		{
			for (int j=0;j<=16;j++)
			{
				dum = input[i][j]*input[i+1][j+1]*input[i+2][j+2]*input[i+3][j+3];
				if (dum>max)
					max=dum;
			}
		}
		
		for (int i=19;i>=3;i--)
		{
			for (int j=0;j<=16;j++)
			{
				dum = input[j][i]*input[j+1][i-1]*input[j+2][i-2]*input[j+3][i-3];
				if (dum>max)
					max=dum;
			}
		}		

		System.out.println(max);
	}
}
