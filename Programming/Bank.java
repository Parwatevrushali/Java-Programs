import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime ;
class Bank
{
	static String name ;
	static String address;
	static long contact;
	static long adhar;
	static String pancard;
	static double balance;
	static int pin;
	static LocalDateTime a; //null
	static ArrayList<String> transaction = new ArrayList<String>();


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		welcomeLoop :
			for (; ; )
			{
			  System.out.println("\n WELCOME ");
			  System.out.println(" ***** LAXMI CHIT FUND **** \n " );
			  System.out.print(" 1.CREATE ACCOUNT \n 2.LOGIN \n ");
			  System.out.print("Enter your resp : ");
			  int resp = sc.nextInt();

			  switch(resp) {
				
					case 1 : {
						if(name!=null) {
							System.out.println("\n ACCOUNT ALREADY EXISTS \n ");
							continue;
						}

						System.out.println("\n ACCOUNT CREATION PAGE \n ");
						System.out.print("Name : ");
						name = new Scanner(System.in).nextLine();
						System.out.print("Address : ");
						address = new Scanner(System.in).nextLine();
						System.out.print("Contact : ");
						contact = new Scanner(System.in).nextLong();
						System.out.print("Adhar : ");
						adhar = new Scanner(System.in).nextLong();
						System.out.print("pancard : ");
						pancard = new Scanner(System.in).next();
						System.out.print("Enter an amount : " );
						balance = new Scanner(System.in).nextDouble();
						transaction.add("DEPOSITE (Creation) : " +balance);
						System.out.print("Pin : ");
						pin = new Scanner(System.in).nextInt();
						System.out.println(" ***** ACCOUNT CREATED SUCCESSFULY \n ");
						break ;

					}

					case 2 : {
						if(name == null) {
							System.out.println("\n CREATE YOUR ACCOUNT FIRST \n ");
							continue;

						}

						System.out.println("\n LOGIN MODULE \n");
						System.out.print("Contact : ");
						long userContact = new Scanner(System.in).nextLong();
						System.out.print("PIN : ");
						long userPin = new Scanner(System.in).nextInt();

						if(contact == userContact && pin == userPin) {
							System.out.println("\n LOGIN SUCCESSFULLY \n ");

							features :
								for (; ; )
								{
								System.out.println("\n ***** FEATURES ***** \n ");
								System.out.println(" \n 1.DEPOSIT \n 2.WITHDRAW \n 3.CHECK BALANCE \n 4.TRANSACTION \n 5.LOGOUT \n");
								System.out.print("\n Enter your option : ");
								int opt = sc.nextInt();

								switch(opt) {
									case 1 : {
										System.out.println("\n DEPOSITE AMOUNT MODULE \n ");
										System.out.print("Enter deposite amount : ");
										double deptAmt = new Scanner(System.in).nextDouble();
										balance += deptAmt;
										a = LocalDateTime.now();
										transaction.add("DEPOSIT : " + deptAmt + " rs.    " +
                                        (a.getHour()%12 + ":" + a.getMinute() + ":" + a.getSecond() + "   " +
                                         a.getMonth() + ":" + a.getDayOfWeek() + ":" + a.getYear()));

										System.out.println(" \n AMOUNT DEPOSITED SUCCESSFULLY \n ");
										break;

									}

									case 2 : {
										System.out.println("\n WITHDRAW AMOUNT MODULE \n ");
										System.out.print("Enter an amount : ");
										double wdrwAmt = new Scanner(System.in).nextDouble();
										System.out.print("Enter your pin : ");
										int pin2 = new Scanner(System.in).nextInt();
										if(pin2 == pin ) {
											if (wdrwAmt<=balance)
											{
												balance -= wdrwAmt;
												a = LocalDateTime.now();
												transaction.add("WITHDRAW : " +wdrwAmt + " rs.    " +
                                                (a.getHour()%12 + ":" + a.getMinute() + ":" + a.getSecond() + "   " +
                                                a.getMonth() + ":" + a.getDayOfWeek() + ":" + a.getYear()));
									         	
												System.out.println("\n AMOUNT DEBITED SUCCESSFULLY \n ");
											}
											else {
												System.out.println("\n  INSUFFICIENT BALANCE\n ");
											}
										}
											else {
												System.out.println("\n INVALID PIN \n ");
											}

											break;
										}

										case 3 : {
											System.out.println("\n CHECK BALANCE MODULE \n ");
											System.out.print("Enter your pin : ");
											int pin2 = new Scanner(System.in).nextInt();
											if(pin2 == pin) {
												System.out.println("Your account balance is : "+balance+"rs.");
											} else {
												System.out.println("\n INVALID PIN \n ");
											}
											break;

										}

										case 4 : {
											System.out.println("\n *** TRANSACTIONS *** \n");
											for(String ele : transaction) {
												System.out.println(ele);
											}
											System.out.println();
											break;
										}

										case 5: {
											System.out.println("\n THANK U & VISIT AGAIN \n");
											continue welcomeLoop;
										}

										default : {
											System.out.println("\n INVALID RESPONSE \n");
										}
									}

								}
								}
								else {
									System.out.println("\n INVALID CREDENTIALS \n ");
								}

								break;
						}

						default : {
							System.out.println("\n INALID RESPONSE \n ");

                        }

			  }

			}

	}

}
			
							

		       
			
	

