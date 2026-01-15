class WideningShort
{
	public static void main(String[] args) 
	{

		 

		// Widening conversion:  short to  int ,long , float , double
		// Note: short to char is NOT a widening conversion

		short s1 = 3251;
		System.out.println(s1); //3251

		/* char ch ='s1';
		System.out.println(ch); //CTE unclosed character literal  */

		int i1 =s1;
		System.out.println(i1); //3251

		long l1 = i1;
		System.out.println(l1); //3251

		float f1 = l1;
		System.out.println(f1); //3251.0

		double d1 = f1;
		System.out.println(d1); //3251.0 
}
}
