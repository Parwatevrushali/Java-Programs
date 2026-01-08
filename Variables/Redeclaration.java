class Redeclaration 
{
	public static void main(String[] args) 
	{

//we cannot have more than one local variable of same name within the same block we get compile time error

		{
			int a=100;
			System.out.println(a); //100

			//char a ='a';  //Compile Time Error
		}
	}
}
