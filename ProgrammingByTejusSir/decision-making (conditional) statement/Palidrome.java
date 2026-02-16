import java.util.Scanner;
class Palidrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int num = sc.nextInt();
		int rev = 0;
		int temp = num;

		while (temp!=0)
		{
			int last = temp%10;
			rev = rev *10 +last;
			temp/=10;
		}

		if(num==rev)
		{
			System.out.println("Original Number: " + num);
            System.out.println("Reversed Number: " + rev);
			System.out.println( "The number is Palidrom : ");

		}

		else {

			System.out.println("Original Number: " + num);
            System.out.println("Reversed Number: " + rev);
            System.out.println( "The number is not palidrom: ");

		}


	}
}
