class PracticeVariables
{   
   //declare a variable then initialie it then assign value
	public static void main(String[] args) 
	{
		{
	    String name;
		int age;
		float percentage;
		long phno;
		char grade;

		name = "Vrushali";
		age  = 22;
		percentage = 9.75f;
		phno = 7841809347L;
		grade = 'A';

		System.out.println("My name is : " + name);
		System.out.println("My age is : " + age);
		System.out.println("My percentage is : " + percentage);
		System.out.println("My phone no is : " + phno);
		System.out.println("My grade is : " + grade);   

		}

		{

		//variable declaration and initialization statment declare a variable and store it simultaneously
        
		String name = "Vrushali";
		int age = 22;
		float percentage = 9.75f;
		long phno = 7841809347L;
		char grade = 'A';

		System.out.println("My name is :" + name);
		System.out.println("My age is :" + age);
		System.out.println("My percentage is :" + percentage);
		System.out.println("My phone no  is :" + phno);
		System.out.println("My grade  is :" + grade);

		}

		{
			//defining characteristics of local variable 

			//a variable declared inside the class remain local to the block(accessible in the same block ) not outside the block else get compile time error

			int a = 20;
			System.out.println(a);

		}

		{
			//System.out.println(a); //CTE cannot find symbol

		}

		//System.out.println(a);  //CTE cannot find symbol
         
		{
			//we cannot have more than one local variable of same name in same block we get compile time error
			
			int b = 15;
			System.out.println(b);

			//char b = 'a';
			//System.out.println(b); //CTE variable b is already defined

		}


		{
			//we can have more than one local variable of same name in different block 

			int d= 39;
			System.out.println(d);

		}

		{   
			char d = 'a';
			System.out.println(d);

		}

		{
			//we can not use a local variable without initialization we get complie time error bcz local variables are not assigned with default values

			//int d;
			//System.out.println(d);

		}

		

		


	}
}
