class Power 
{
	public static void main(String[] args) 
	{
		int num = 2;
		int raise = 5;

		int res = 1;

		for (int i=0;i<5 ;i++ )
		{
			res = res *num;
		}

		System.out.println(num + " ^ " +raise + " is " +res);
	}
}
