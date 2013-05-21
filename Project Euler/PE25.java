// Written in March 2013
// Problem 25
// By Andy Zhang
public class PE25 {

	public static void main(String[] args)
	{
		int[][] list = new int[9000][1000];
		int count=1, a=0;
		
		list[0][0]=1;
		list[1][0]=1;
		
		for (int i=2;i<list.length;i++)
		{
			for (int j=0;j<=count;j++)
			{
				list[i][j]=list[i-1][j]+list[i-2][j]+list[i][j];
				if (list[i][999]>=1)
				{
					a=i;
					System.out.println((i+1));
					return;
				}
				
				if (list[i][j]>=10)
				{
					list[i][j]-=10;
					list[i][j+1]++;
					if (j==count)
						count++;
				}

			}
		}
	}
}
