import java.util.Scanner;
class NumberToWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int rev = 0;

		while (num > 0)
		{
			int last = num % 10;
			rev  = rev * 10 + last;
			num = num/10;
		}

		while (rev > 0)
		{
			int last = rev % 10;
			 
			if (last == 0)
			{
				System.out.print("zero ");
			}
			else if (last == 1)
			{
				System.out.print("one ");
			}
			else if (last == 2)
			{
				System.out.print("two ");
			}
			else if (last == 3)
			{
				System.out.print("three ");
			}
			else if (last == 4)
			{
				System.out.print("four ");
			}
			else if (last == 5)
			{
				System.out.println("five ");
			}
			else if (last == 6)
			{
				System.out.print("six ");
			}
			else if (last == 7)
			{
				System.out.println("seven ");
			}
			else if (last == 8)
			{
				System.out.print("eight ");
			}
			else if (last == 1)
			{
				System.out.print("nine ");
			}

			rev = rev/10;
		}
	}
}
