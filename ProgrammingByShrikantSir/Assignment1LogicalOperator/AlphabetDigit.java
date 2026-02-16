import java.util.Scanner;
class AlphabetDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);

		String res = ((ch>=65 && ch<=90 || ch>=97 && ch<=122)?
			         ((ch>=65 && ch<=90 ) ? (ch+ " is Uppercase") : (ch+ " is Lowercase")):
			         (ch>=48 && ch<=57) ? (ch+ " is digit"): (ch+ " is not alphabet and not digit"));
		System.out.println(res);
	}
}
