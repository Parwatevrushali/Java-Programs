import java.util.Scanner;
class DynamicReadingExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = sc.nextLine();

		System.out.println("Enter your age:");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your gender:");
		char gender = sc.next().charAt(0);
		sc.nextLine();

		System.out.println("Enter your percentage:");
		float percentage = sc.nextFloat();

		System.out.println("\n-------Your Details----");
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Gender:" +gender);
		System.out.println("Percentage:" +percentage);
		


		
	}
}
