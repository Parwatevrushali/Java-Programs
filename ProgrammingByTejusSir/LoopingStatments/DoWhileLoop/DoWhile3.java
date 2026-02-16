import java.util.Scanner;
class DoWhile3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number whose table need to be printed :");
		int num = sc.nextInt();

		int i = 1;

		do
		{
			System.out.println(num + " x " + i + " = " +(num * i));
			i++;
		}
		while (i<=10);
	}
}
