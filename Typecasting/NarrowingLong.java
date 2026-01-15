class NarrowingLong
{
	public static void main(String[] args) 
	{
		


		//Narrowing conversion- long to  int, char, short, byte


		long l1 = 3456l;
		System.out.println(l1);  //3456

		int i1=(int) l1;
		System.out.println(i1); //3456

		char ch =(char) i1;
		System.out.println(ch);  //?

		short s1 = (short) ch;
		System.out.println(s1); //3456

		byte b1 =(byte) s1;
		System.out.println(b1); //-128  

		




	}
}
