import java.util.Scanner;
class CountDigitsNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number : ");

		int temp = sc.nextInt();
		int count = 0;

		while (temp != 0) {
        temp = temp / 10;
			count++;
		}
		System.out.println("total digits = " +count);


	}
}
