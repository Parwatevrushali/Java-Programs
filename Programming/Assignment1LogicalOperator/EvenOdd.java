import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		String res = (num%2==0)? (num+ " is even no "): (num+ " is odd number");
		System.out.println(res);
		

	}
}
