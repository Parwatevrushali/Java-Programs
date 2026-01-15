class WideningChar
{
	public static void main(String[] args) 
	{


       // Widening conversion:  char to  int ,long , float , double
		

		char ch = 'c';
		System.out.println(ch); //c

		int i1 = ch;
		System.out.println(i1); //99

		long l1 = i1;
		System.out.println(l1); //99

		float f1 = l1;
		System.out.println(f1); //99.0

		double d1 = f1;
		System.out.println(d1); //99.0 

	}

}

