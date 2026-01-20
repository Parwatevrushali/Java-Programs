class DecrementOperator 
// Demonstrates pre-decrement and post-decrement behavior

{
	public static void main(String[] args) 
	{
		int sal = 120;  

		System.out.println(--sal);             //119
		System.out.println(--sal);             //118
		System.out.println(sal--);             //118
		System.out.println(--sal - sal--);     //0
		System.out.println(--sal + sal--);     //228
		System.out.println(--sal);             //112
		System.out.println(sal--);             //112
		System.out.println(--sal);             //110
		System.out.println(sal--);             //110
		System.out.println(sal--);             //109
		

	}
}
