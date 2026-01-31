import java.util.Scanner;
class ATM 
{
	static int deposit, balanceCheck, withdraw, exit;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of customers :");
		int cust = sc.nextInt();
		sc.nextLine();

		for (int i=1; i<=cust; i++ )
		{
			System.out.println("\n ****** WELCOME ***** ");
			System.out.println("AIM TO MAKE CASHLESS INDIA ");
			System.out.println(" 1.DEPOSIT\n 2.BALANCE CHECK\n 3.WITHDRAW\n 4.EXIT ");
			System.out.println("\n Enter your resposnse : ");
			String res = sc.nextLine().toUpperCase();

			if(res.equals("DEPOSIT"))
			{
				deposit++;
				System.out.println("YOU HAVE CLICK ON DEPOSIT");
			}

			else if (res.equals( "BALANCE CHECK"))
			{
				balanceCheck++;
				System.out.println("YOU HAVE CLICK ON BALANCE CHECK");
			}
			else if (res.equals("WITHDRAW"))
			{ 
				 withdraw++;
				 System.out.println("YOU HAVE CLICK ON WITHDRAW");
			}
			else if (res.equals("EXIT"))
			{
				exit++;
				System.out.println("YOU HAVE CLICK ON EXIT");
			}
			 else{
				 System.out.println("INVALID RESPONSE");
				 i--;
			}
		}

		System.out.println("deposit : " +deposit);
		System.out.println("balance check : " +balanceCheck);
		System.out.println("withdraw : " +withdraw);
		System.out.println("exit : " +exit);
	}
}
