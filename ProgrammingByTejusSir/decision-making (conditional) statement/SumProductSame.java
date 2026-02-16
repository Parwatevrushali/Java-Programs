class SumProductSame 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int sum = 0;
		int pro = 1;


		while (num>0)
		{
			int last = num%10;
			sum = sum+last;
			pro = pro*last;
			num = num/10;
		}
			if (sum==pro)
			{
				System.out.println("The Sum of digit and product of digit is same " );
			}

			else {
				System.out.println("The sum of digit and product of digit is not same ");
			}

			System.out.println (sum + " = " + pro);
	}
}
