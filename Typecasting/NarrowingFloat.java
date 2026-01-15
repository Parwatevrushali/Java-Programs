class NarrowingFloat 
{
	public static void main(String[] args) 
	{


		//Narrowing conversion- float to  long, int, char, short, byte


		float f1 = 34.3f;
		System.out.println(f1);  //34.3

		long l1 = (long) f1;
		System.out.println(l1); //34

		int i1 =(int) l1;
		System.out.println(i1); //34

		char ch = (char) i1;
		System.out.println(ch); //"

		short s1 = (short) ch;
		System.out.println(s1); //34

		byte b1= (byte) s1;
		System.out.println(b1); //34 


		








	}
}
