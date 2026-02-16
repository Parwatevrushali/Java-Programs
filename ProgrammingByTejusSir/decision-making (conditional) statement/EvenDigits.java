import java.util.Scanner;
class EvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int num = sc.nextInt();
		int temp = num;

		System.out.println("Even digits are : ");

		while (temp > 0)
		{
			int digit = temp % 10;  //get last digit
			if (digit % 2 == 0)   //check if even 
			{
				System.out.println(digit + "  " );
			}
			temp = temp/10 ;  //remove last digit
		}

		
	}
}
