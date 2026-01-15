class  ByteCycleExplation
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		System.out.println(b1);  //100

		byte b2 =(byte) 128;
		System.out.println(b2);  //-128   128-256=-128

		byte b3 =(byte) 159;
		System.out.println(b3);  //-97   159-256=-97

		byte b4 = 97;
		System.out.println(b4);  //97

		byte b5 = (byte) 500;
		System.out.println(b5);  //-12    500-256=244.  244 is not in range of -128 to 127 then we again substract it  244-256= -12.   thats why ans is -12 is in range of byte

		byte b6 = (byte)256;
		System.out.println(b6);  //0      bcz 256-256=0

		byte b7 =(byte) 255;
		System.out.println(b7);  //-1     bcz 255-256=-1

		byte b8 =(byte) 9223372036l;
		System.out.println(b8);       //4

		byte b9 =(byte)9223372037l;
		System.out.println(b9);       //5
	}
}
