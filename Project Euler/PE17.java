// Written in March 2013
// Problem 17
// By Andy Zhang
public class PE17 {

	public static void main(String[] args)
	{
		int[][] number = new int[1000][5];
		
		setList(number);
		// displayArray(number);
			for (int j=0;j<number.length;j++)
			{
			//	System.out.println(Integer.toString(number[j][3])+Integer.toString(number[j][2])+Integer.toString(number[j][1])+Integer.toString(number[j][0]));
				if (number[j][1]!=1)
				{
					number[j][4]+=decimal(number[j][0]);
					number[j][4]+=twentyUp(number[j][1]);
				}
				else if (number[j][1]==1)
				{
					number[j][4]+=unit(number[j][0]); // ELEVEN, TWELVE...
				}
				if (number[j][2]>0)
				number[j][4]+=((decimal(number[j][2]))+7); // HUNDRED
				if (number[j][3]>0)
				number[j][4]+=((decimal(number[j][3]))+8); // THOUSAND
				
				if (number[j][2]>0&&(number[j][0]!=0||number[j][1]!=0))
				{
					number[j][4]+=3; // AND
				}
			}
			// displayArray(number);
			System.out.println(sum(number));
	}
	
	public static void setList(int[][] a)
	{
		for (int i=0;i<a.length;i++)
		{
			a[i][0]=i+1;
			if (a[i][0]>=1000)
			{
				a[i][3]+=(a[i][0]/1000);
				a[i][0]-=1000;		
			}
			
			if (a[i][0]>=100)
			{
				a[i][2]+=(a[i][0]/100);
				a[i][0]=a[i][0]%100;		
			}
			if (a[i][0]>=10)
			{
				a[i][1]+=(a[i][0]/10);
				a[i][0]=a[i][0]%10;				
			}
		}
	}
	
	public static int unit(int a) // 10-20
	{
		int b=0;
			switch(Integer.toString(a))
			{
				case "0":
					b=3;
					break;
				case "1":
				case "2":
					b=6;
					break;
				case "3":
				case "4":
				case "9":	
				case "8":
					b=8;
					break;
				case "5":
				case "6":
					b=7;
					break;
				case "7":

					b=9;
					break;

			}
		//	System.out.print(b+"\t");
			return b;
	}
	
	public static int twentyUp(int a) // 20-100
	{
		int b=0;
			switch(Integer.toString(a))
			{
				case "0":
					b=0;
					break;
				case "2":
				case "3":

				case "8":
				case "9":
					b=6;
					break;
				case "5":
				case "6":
				case "4":
					b=5;
					break;
				case "7":
					b=7;
					break;
			}
		//	System.out.println(b+"\t");
			return b;
	}
	
	public static int decimal(int a) // 0-9
	{
		int b=0;
			switch(Integer.toString(a))
			{
				case "0":
					b = 0;
					break;
				case "1":
				case "2":
				case "6":
					b = 3;
					break;
				case "4":
				case "5":
				case "9":
					b = 4;
					break;
				case "7":
				case "3":
				case "8":
					b = 5;
					break;	
			}
		//	System.out.println(b+"\t");
			return b;
	}
	/*public static void displayArray(int[][] a)
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}*/
	
	public static int sum(int[][] a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i][4];
		}
		return sum;
	}
}
