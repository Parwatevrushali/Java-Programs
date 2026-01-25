class ArithmeticOperatorPractice 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 10+20;
		System.out.println(b3);

		//byte b4 = b1+b2;
		//System.out.println(b4);  // possible lossy

		int b4 = b1+b2;
		System.out.println(b4);


		long l1 = 123456L;
		long l2 = 143789L;
		long l3 = l1 + l2;

		System.out.println(l3);


		short s1 = 20;
		short s2 = 30;
		short s3 = 20 * 30;

		System.out.println(s3);

		//short s4 = s1 * s2;
		//System.out.println(s4);  //possible lossy conversion from into to short 

		int i1 = 10;
		int i2 = 5;
        int i3 = i1/i2;

		System.out.println(i3);

		char ch1 ='a';
		char ch2 ='z';
		//char ch3 = ch1/ch2;

		//System.out.println(ch3);

		int ch4 = ch1/ch2;

		System.out.println(ch4);
	}
}
