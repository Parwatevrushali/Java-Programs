import java.util.Scanner;
class Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:");
		char ch = sc.next().charAt(0);

		String res = ((ch>=48 && ch<=57)?
			         (ch+ " is digit"):
			         (ch+ " is not digit"));
		System.out.println(res);
	}
}
