class LargestOfFour 
{
	public static void main(String[] args) 
	{
		int n1 = 12;
		int n2 = 30;
		int n3 = 122;
		int n4 = 2033333333;

		int large = n1 > n2 ? n1: n2;
		large = large > n3 ? large : n3;
		large = large > n4 ? large : n4;
		System.out.println(large); //2033333333


		int largest =(n1 > n2 ?
    
        (n1 > n3 ? (n1 > n4 ? n1 : n4) : (n3 > n4 ? n3 : n4))
        :
        (n2 > n3 ? (n2 > n4 ? n2 : n4) : (n3 > n4 ? n3 : n4))  );

        System.out.println(largest);   //2033333333

	}
}
