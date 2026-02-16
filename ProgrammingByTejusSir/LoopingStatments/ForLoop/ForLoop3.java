import java.util.Scanner;
class ForLoop3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number whose table need to be printed :");
		int num = sc.nextInt();

		for (int i = 1; i<=10 ; i++)
		{
			System.out.println(num + " x " + i + " = " +(num*i));
		}
	}
}
