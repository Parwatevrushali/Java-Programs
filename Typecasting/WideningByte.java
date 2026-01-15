class WideningByte
{
	public static void main(String[] args) 
	{

		 // Widening conversion: byte to short , int ,long , float , double
        // Note: byte to char is NOT a widening conversion

		byte b1 = 100;
		System.out.println(b1);  //100

		short s1 =b1;
		System.out.println(s1); //100

		/* char ch = 's1';
		System.out.println(ch); // CTE unclosed character literal */

		int i1 = s1;
		System.out.println(i1); //100
        
		long l1 = i1;
		System.out.println(l1); //100


		float f1 = l1;
		System.out.println(f1); //100.0

		double d1 = f1;
		System.out.println(d1); //100.0  

	}

}