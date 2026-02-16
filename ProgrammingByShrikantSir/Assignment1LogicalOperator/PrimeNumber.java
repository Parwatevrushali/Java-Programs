import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		String res =(n <= 1) ? "Not Prime" :
                    (n == 2 || n == 3 || n == 5 || n == 7) ? "Prime" :
                    (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) ? "Not Prime" : "Prime";

                    System.out.println(res);

	}
}
