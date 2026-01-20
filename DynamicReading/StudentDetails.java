import java.util.Scanner;
class StudentDetails 
{     
	//WAPT to dynamically read a students name, roll number, and percentage, then display the details.

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String sName = sc.nextLine();

		System.out.println("Enter your roll number:");
		int rollNo = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your Percentage:");
		float percentage = sc.nextFloat();
		sc.nextLine();

		System.out.println("\n-----Student Details----");
		System.out.println("Name:" + sName);
		System.out.println("Rollno:" + rollNo);
		System.out.println("Percentage:" + percentage);

        sc.close();
		
	}
}
