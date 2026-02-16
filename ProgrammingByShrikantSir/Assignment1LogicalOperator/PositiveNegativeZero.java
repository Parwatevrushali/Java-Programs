import java.util.Scanner;
class PositiveNegativeZero 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		String res = (num > 0) ? (num + " is Positive") :
                     (num < 0) ? (num + " is Negative") :
                     (num + " is Zero");

        System.out.println(res);

	}
}
