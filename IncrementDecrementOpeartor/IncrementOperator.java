class IncrementOperator 
{
	public static void main(String[] args) 
	{
		int poc = 100;    //106

		System.out.println(++poc); //101
		System.out.println(++poc); //102
		System.out.println(poc++); //102
		System.out.println(++poc + poc++); //104+104=208
		System.out.println(poc);   //105        
		System.out.println(poc++); //105
	}
}
