import java.util.Scanner;

public class PE15 {

	public static void main(String[] args)
	{
		int size=20;
		long[][] grid = new long[size][size];
		
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		boolean edge=true;
		grid[0][0]=1;
		
		for (int i=1;i<size;i++)
		{
			if (a==1&&b==1)
			{
				grid[0][0]=0;
			}
			else if (a==1)
			{
				grid[b-1][0]=0;
			}
			else if (b==1)
			{
				grid[0][a-1]=0;
			}
			grid[i][0]+=grid[i-1][0];
			grid[0][i]+=grid[0][i-1];

		}
		
		for (int count=1;count<size;count++)
		{
			for (int j=count;j<size;j++)
				{
					grid[j][count]=grid[j][count-1]+grid[j-1][count];
					grid[count][j]=grid[count-1][j]+grid[count][j-1];
					if (j==a&&count==b)
					{
						grid[count][j]=0;
					}
				}
		}
		
		System.out.print(grid[size-1][size-1]);
		System.out.println();
		
		for (int i=0;i<grid.length;i++)
		{
			for (int j=0;j<grid.length;j++)
			{
				System.out.print(grid[i][j]+"\t\t");
			}
			System.out.println();
		}
	}
}
