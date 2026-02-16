class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int res = 1;

		while (num>0)
		{
			int last = num%10;
			res = res*last;
			num = num/10;

		}

		System.out.println(res);

		
	}
}
