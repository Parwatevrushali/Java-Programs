//Read ONE integer and print it

import java.util.Scanner;
class  ReadOneInteger
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("enter first integer:");
		int number = sc.nextInt();

		System.out.println(number);
	}
}
