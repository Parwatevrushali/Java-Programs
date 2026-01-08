class LocalScope
{
	public static void main(String[] args) 
	{

//A VARIABLE DECLARED INSIDE THE BLOCK REMAIN LOCAL  TO THE BLOCK(CAN BE ACCESSIBLE WITHIN SAME BLOCK )NOT OUTSIDE THE BLOCK
	
		 {

		int a=100;
		System.out.println(a); //100
		}

		//System.out.println(a); //Compile Time Error

	}

}
