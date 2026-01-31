import java.util.Scanner;
class EMV 
{  
	static int bjp, aap, cong, mns, nota;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the population of area :");
		int population = sc.nextInt();

		for (int i=1; i<=population; i++)
		{
            System.out.println("\n ****** WELCOME ******* ");
			System.out.println(" APKA EK VOTE DESH BADAL NAHI SAKATA HAI \n ");
			System.out.println(" 1.BJP\n 2.AAP \n 3.CONG \n 4.MNS \n 5.NOTA ");
			System.out.println("\n Enter your response :");
			String resp = sc.next().toUpperCase();

			if(resp.equals("BJP")) 
			{
				bjp++;
				System.out.println("YOU HAVE VOTED FOR BJP");
				System.out.println("ACCHE DIN AYENGE \n");
		}

		 else if(resp.equals("AAP"))
			{
			 aap++;
			 System.out.println("YOU HAVE VOTED FOR AAP");
			 System.out.println("APKA EK VOTE MUJHE AZAD KAR SAKATA HAI\n");
          }

		  else if(resp.equals("CONG"))
			{
			  cong++;
			  System.out.println("YOU HAVE VOTED FOR CONG");
			  System.out.println("BHARAT JODO\n");
			}

			else if (resp.equals("MNS"))
			{
				mns++;
				System.out.println("YOU HAVE VOTED FOR MNS");
				System.out.println("JAI MAHARASTRA\n");
			}

			else if (resp.equals("NOTA"))
			{
				nota++;
				System.out.println("YOU HAVE VOTED FOR NOTA");
				System.out.println("OHHH YOU ARE EDUCATED ? \n");
			}
	       	else {
				System.out.println("INVALID RESPONSE ");
				i--;

			}

		}

		System.out.println("bjp : " +bjp);
		System.out.println("aap : " +aap);
		System.out.println("cong : " +cong);
		System.out.println("mns : " +mns);
		System.out.println("nota : " +nota);

		if(bjp>=cong && bjp>=aap && bjp>=mns && bjp>=nota) 
		{
			System.out.println("BJP has won the election by " +bjp+ " votes ");

		}
		else if (cong>=mns && cong>=bjp && cong>=aap && cong>=nota)
		{
			System.out.println("CONG has won the election by " +cong+ " votes");
		}
		else if (mns>=bjp && mns>=aap && mns>=nota && mns>=cong)
		{
			System.out.println("MNS has won the election by " +mns+ " votes");
		}
		else if (aap>=bjp && aap>=mns && aap>=mns && aap>=nota)
		{
			System.out.println("AAP has won the election by " +aap+ " votes");
		}
		else {
			System.out.println("NOTA has won the election by " +nota+ " votes");
        }

	}
}
