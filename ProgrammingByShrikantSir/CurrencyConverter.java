import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//infiniteLoop

		for (; ; )
		{
			System.out.println("\n WELCOME \n ");
			System.out.println("\n ****** CURRENCY CONVERTER ******* \n ");
			System.out.println("Enter your response (INR) : ");
			double amount = sc.nextDouble();

			System.out.println(" 1.USD \n 2.EUR \n 3.KWD\n 4.GBP \n 5.CAD \n 6.AUD \n 7.ALL ");
			System.out.println("Enter your response : ");
			String resp = sc.next().toUpperCase();

			boolean assump = true ;
			double convertedAmount = 0;
			if (resp.equals("USD"))
			{
				convertedAmount = amount /90.21;
			}
			else if  (resp.equals("EUR"))
			{
				convertedAmount = amount /106.53;
			}
			else if  (resp.equals("KWD"))
			{
				convertedAmount = amount /293.61;
			}
			else if  (resp.equals("GBP"))
			{
				convertedAmount = amount /123.29;
			}
			else if  (resp.equals("CAD"))
			{
				convertedAmount = amount /65.86;
			}
			else if  (resp.equals("AUD"))
			{
				convertedAmount = amount /63.24;
			}
			else if  (resp.equals("ALL"))
			{
				convertedAmount = amount /1.10;
			}
			else {
				assump = false;
				System.out.println("\n INVALID CURRENCY  \n ");

			}
			if (assump)
			{
				System.out.printf("%n%20.2f INR = %.2f %s%n " , amount, convertedAmount,resp);
			}


		}

	}
}
