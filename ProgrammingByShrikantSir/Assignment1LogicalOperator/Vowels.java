import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);

		String res = ((ch>='A' && ch<='Z' || ch>='a' && ch<='z'))?
			         ((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?
			         (ch+ " is vovel"): (ch+ " is consonant")):
			         (ch+ " is not a alpabet");
		System.out.println(res);
			         
			         
	}
}
