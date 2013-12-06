import java.util.Arrays;


public class PE29 {

	// size of the grid of numbers
	static int size = 100;
	
	public static void main(String args[])
	{
		// number of distinct numbers
		int count=0; 
		boolean number[][] = new boolean[size][size];
		long startTime = System.currentTimeMillis();
		
		// Let everything be distinct
		for (int i=0;i<size;i++)
		{
			Arrays.fill(number[i], true);
		}
		
		// Remove column of 1s
		for (int i=0;i<size;i++)
		{
			number[0][i] = false;
		}
		
		// Iterate through grid
		for (int i=0; i<size; i++)
		{
			for (int j=1; j<size; j++)
			{
				if (number[i][j])
				{
					count++;
					
					// Brute force all of the powers 
					// since algorithm can't detect
					// numbers that are squared and that are 
					// between i+1 and its square
					if (i+1 == 4)
					{
						removeIdentical(number, 2, (j+1)*2);
					}
					else if (i+1 == 8)
					{
						removeIdentical(number, 2, (j+1)*3);
					}
					else if (i+1 == 16)
					{
						removeIdentical(number, 2, (j+1)*4);
					}
					else if (i+1 == 32)
					{
						removeIdentical(number, 2, (j+1)*5);
					}
					else if (i+1 == 64)
					{
						removeIdentical(number, 2, (j+1)*6);
					}
					else if (i+1 == 9)
					{
						removeIdentical(number, 3, (j+1)*2);
					}
					else if (i+1 == 27)
					{
						removeIdentical(number, 3, (j+1)*3);
					}
					else
						removeIdentical(number, i+1, j+1);
				}
			}
		}
		 
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime+"ms");
		System.out.println(count);
	}
	
	private static void removeIdentical(boolean[][] number, int base, int exp)
	{
		if (base>size || exp == 1)
			return;
		if (exp < size)
		{
			try {
				number[base-1][exp-1] = false;
			} catch (ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				System.out.println(base+" and "+exp);
			}
		}
		
		//System.out.println("Base is " + base + " and exponent is " + exp);
		int i=2;
		while (i <= size && Math.pow((double)base, i) <= size)
		{
			if (exp % i == 0)
			{
				removeIdentical(number, (int) Math.pow((double) base, (double) i), exp/i);
			}

			i++;
		}
		return;
	}
}
