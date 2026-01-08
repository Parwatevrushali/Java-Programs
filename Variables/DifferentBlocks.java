class DifferentBlocks 
{
	public static void main(String[] args) 
	{
//we can have more than one local variable of same name on the different block 
// Both variables 'a' are allowed because they are declared in different blocks


		{
			int a=100;
			System.out.println(a);
		}
		{
			char a='a';
			System.out.println(a);
		}
	}
}
