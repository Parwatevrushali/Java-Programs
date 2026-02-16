import java.util.Scanner;
class SearchDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		System.out.println("Enter the number to be searched : ");
		int digit = sc.nextInt();

		boolean found = false;
		

		while (num>0)
		{
			int last = num %10;
			if (last==digit)
			{
			   found = true;
			    break;
			}
	
			num/=10;

		}

			if (found)
			{
				System.out.println("The digit is present");
			}
			else {
				System.out.println("The digit is not present");
			}
		}
	}

