import java.util.Scanner;
class Pounds 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds(lb):");
		double pound = sc.nextDouble();

		System.out.println("Pounds is Converted into Kilogram : ");
		final double kilogram = pound * 0.454;

		System.out.println(pound + " lb = " + kilogram + " kg");

	}
}
