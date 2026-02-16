import java.util.Scanner;
class SumEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int evenSum =0;
		int oddSum =0;

		while (num >0)
		{
			int last = num %10;

			if (num%2==0)
			{
			evenSum = evenSum+last;
			}
			else {
			oddSum = oddSum+last;
			}

			num =num/10;

		}
		System.out.println("sum of even no is : " +evenSum);
		System.out.println("sum of odd no is : " +oddSum);
		}
		
	}

