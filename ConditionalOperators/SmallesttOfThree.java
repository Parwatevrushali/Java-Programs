class SmallesttOfThree 
{

	//This program demonstrates different approaches to find the Smallest
    //of three numbers in Java using the ternary operator.

	public static void main(String[] args) 
	{   //First Approach
		int n1= 120;
		int n2= 140;
		int n3= 500;

		int n4 = (n1<n2) ? (n1<n3?n1:n3) : (n2<n3?n2:n3);
		System.out.println(n4);  //120

		//Second Approach

		int n5 = (n1<n2?n1:n2)<n3 ? (n1<n2?n1:n2):n3;
		System.out.println(n5); //120
        
		//Third Approach
		int Small ;
		int Smallest=n1<(Small=n2<n3?n2:n3)?n1:Small;
		System.out.println(Smallest);     //120

		//Fourth Approach
		int Small1 = n1<n2 ? n1:n2;
		int Smallest1 = Small1<n3 ?Small1:n3;
		System.out.println(Smallest1);    //120


	}
}
