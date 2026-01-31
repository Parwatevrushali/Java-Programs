import java.util.Scanner;
class Alphabet1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet:");
		char ch  = sc.nextLine().charAt(0);

		String op = ((ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'))?
		((ch>='A'&&ch<='Z'
		(ch+ "it is a UPPERCASE ALPHABET"):
		(ch+ "it is a Lowercase alphabet")):
		((ch>=48 && ch<=57)?
		(ch+ "it is digit"):
		(ch+ "it is special character"));
         System.out.println(op));
		
	}
}
