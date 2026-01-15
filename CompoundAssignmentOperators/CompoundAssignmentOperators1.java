class CompoundAssignmentOperators1 
{
	public static void main(String[] args) 
	{
		int sal = 10000;
		sal+=5000;
		System.out.println(sal);    //15000

        int balance = 100000;
		balance-=50000;
		System.out.println(balance); //50000

		int salary = 10000;
		salary+=13000.50;
		System.out.println(salary);  //23000

		char ch = 'A';
		ch+=32;
		System.out.println(ch);      //a

		char ch2 = 'a';
		ch2-=32;
		System.out.println(ch2);     //A
	}
}
