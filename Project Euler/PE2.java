// Written in March 2013
// Problem 2
// By Andy Zhang
public class PE2 {

	public static void main(String args[])
	{
		int first=1;
		int second=2;
		int result;
		int total=2;
		int cap=4000000;
		do {
			result=first+second;
			first=second;
			second=result;
			if (result%2==0&&result<cap)
				total+=result;
		} while(result<cap);
		System.out.print(total);
	}
}
