import java.util.Scanner;
class Reverse1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : " );
		int num = sc.nextInt();

		int rev = 0;
		int orignal =num;

		if (num < 0)
		{
			num = -num;
		}

		while (num > 0)
		{
			int last = num%10;
			rev = rev * 10 + last;
			num = num/10;
		}

		if (orignal < 0)
		{
			rev = -rev;
		}

		System.out.println("The reverse number is : " +rev);
	}
}
