class SmallestOfFour 
{
	public static void main(String[] args) 
	{
		int n1 = 12;
		int n2 = 30;
		int n3 = 122;
		int n4 = 2033333333;

		int small = n1 < n2 ? n1: n2;
		small = small < n3 ? small : n3;
		small = small < n4 ? small : n4;
		System.out.println(small); //12


		int Smallest =(n1 < n2 ?
    
        (n1 < n3 ? (n1 < n4 ? n1 : n4) : (n3 < n4 ? n3 : n4))
        :
        (n2 < n3 ? (n2 < n4 ? n2 : n4) : (n3 < n4 ? n3 : n4))  );

        System.out.println(Smallest);   //12

	}
}
