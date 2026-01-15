class NarrowingInt
{
	public static void main(String[] args) 
	{
		  

		//Narrowing conversion- int to   char, short, byte

		int i1 = 345;
		System.out.println(i1);  //345

		char ch = (char) i1;
		System.out.println(ch);  //?

		short s1 = (short) ch;
		System.out.println(s1);  //345

		byte b1 = (byte) s1;
		System.out.println(b1);  //89 

		



	}
}
