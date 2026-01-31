import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Cylinder: ");
		double radius = sc.nextDouble();

		System.out.println("Enter the height of Cylinder: ");
		double height = sc.nextDouble();

		final double AREA = 3.14 * radius * radius;
		final double VOLUME = AREA * height ;

		System.out.println("The area is : " + AREA);
		System.out.println("The volume is : " + VOLUME);
	}
}
