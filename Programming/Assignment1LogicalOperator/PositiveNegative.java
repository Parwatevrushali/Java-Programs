import java.util.Scanner;
class PositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		String res = ((num>=0) ? (num+ " is positive") : (num+ " is negative"));
		System.out.println(res);
	}
}
