class NarrowingDouble  
{
	public static void main(String[] args) 
	{
		 //Narrowing conversion- double to float, long, int, char, short, byte

		double d1 = 4537.0;
		System.out.println(d1);  //4537.0

		float f1 =(float) d1;
		System.out.println(f1);  //4537.0

		long l1 =(long) f1;
		System.out.println(l1);  //4537

		int i1 =(int) l1;
		System.out.println(i1);  //4537

		char ch =(char) i1;
		System.out.println(ch);  //?

		short s1 =(short)ch;
		System.out.println(s1); //4537

		byte b1 = (byte) s1;
		System.out.println(b1);  //-71  


		










	}
}
