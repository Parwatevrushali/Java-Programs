import java.util.Scanner;
class SpecialCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);

		String res = ((ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57)?
			         (ch+ " is not a special character"):
			         (ch+ " is a special character"));
		System.out.println(res);
	}
}
