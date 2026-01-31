import java.util.Scanner;
class Feet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value in feet : ");
		double feet = sc.nextDouble();

		System.out.println("Feet converted into meters: ");
		final double meters = feet * 0.305;

		System.out.println(feet + " feet is " + meters + " m");



	}
}
