import java.util.Scanner;
class Absolute 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();


		System.out.println(Math.abs(num));
	}
}
