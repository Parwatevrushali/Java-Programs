class LargestOfThree 
{

	//This program demonstrates different approaches to find the largest
    //of three numbers in Java using the ternary operator.

	public static void main(String[] args) 
	{   //First Approach
		int n1= 12;
		int n2= 14;
		int n3= 6;

		int n4 = (n1>n2) ? (n1>n3?n1:n3) : (n2>n3?n2:n3);
		System.out.println(n4);  //14

		//Second Approach

		int n5 = (n1>n2?n1:n2)>n3 ? (n1>n2?n1:n2):n3;
		System.out.println(n5); //14
        
		//Third Approach
		int large ;
		int largest=n1>(large=n2>n3?n2:n3)?n1:large;
		System.out.println(largest);     //14

		//Fourth Approach
		int large1 = n1>n2 ? n1:n2;
		int largest1 = large1>n3 ?large1:n3;
		System.out.println(largest1);    //14


	}
}
