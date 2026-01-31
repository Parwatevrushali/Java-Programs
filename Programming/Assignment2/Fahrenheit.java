import java.util.Scanner;
class Fahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius : ");
		double celsius = sc.nextDouble();

		System.out.println("Celsius converted into Fahrenheit : ");
		final double Fahrenheit = (9.0/5) * celsius + 32;

		System.out.println(celsius + " Celsius is " + Fahrenheit + " Fahrenheit" );
	}
}
