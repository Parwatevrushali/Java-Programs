import java.util.Scanner;
class CountLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting year : " );

		int start = sc.nextInt();
		System.out.println("Enter ending year : ");

		int end = sc.nextInt();
		
		int count = 0;

		for (int LeapYear = start; LeapYear<=end ; LeapYear++)
		{
			if (LeapYear %4==0 && LeapYear %100!=0 || LeapYear %400==0)
			{
				count++;
			}
		}

		System.out.println("Total count of leap year is = " +count);

		
	}
}
