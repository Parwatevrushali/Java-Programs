class TypeCasting1
{
	public static void main(String[] args) 
	{
		//widening  

		int a = 10;
		System.out.println(a);

		double d = 34.5f;
		System.out.println(d);

		float f1 = 4567890L;
		System.out.println(f1);

		int i1 = 'a';
		System.out.println(i1);

		char ch = 65;
		System.out.println(ch);

		char ch1 = 127;
		System.out.println(ch);


        //narrowing 

		byte b1 = (byte)  129;
		System.out.println(b1);

		float f = (float) 23.7777;
		System.out.println(f);

		char c = (char) 120;
		System.out.println(c);

		byte bb = (byte) 3000;
		System.out.println(bb);

		short ss = (short) 2000;
		System.out.println(ss);


	}
}
