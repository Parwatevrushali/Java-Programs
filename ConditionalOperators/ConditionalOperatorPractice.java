class  ConditionalOperatorPractice
{
	public static void main(String[] args) 
	{
		//WAPT TO CHECK  WEATHER THE NUMBER IS POSITIVE OR NOT

		int a= 20;
        String res = a>=0 ? "number is positive" : "number is negative";
		System.out.println( res);


		//WAPT TO CHECK  WEATHER THE NUMBER IS EVEN OR ODD

		int b = 54;
		String result = b%2 == 0 ? "The number is Even" : "The number is odd";
		System.out.println(result);

		//WAPT TO CHECK LARGEST OF TWO NUMBERS

		int p = 20;
		int q = 40;
		int res1 = p > q ? p : q;
		System.out.println(res1);

		//WAPT TO CHECK SMALLEST OF TWO NUMBERS

		int c = 89;
		int d = 56;
		int res2 = c < d ? c : d;
		System.out.println(res2);


		//WAPT TO CHECK LARGEST OF THREE NUMBERS

		int x = 34;
		int y = 23;
		int z = 9;
		int res4 = (x > y )? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(res4);

		////WAPT TO CHECK SMALLEST OF THREE NUMBERS

		int m = 76;
		int n = 8;
		int l = 24;
		int res5 = (m<n) ? (m<l?m:l) : (n<l?n:l);
		System.out.println(res5);

		//WAPT TO CHECK LARGEST OF FOUR NUMBERS

		int b1 = 1;
		int b2 = 2;
		int b3 = 3;
		int b4 = 4;

		int large = b1 > b2 ? b1 : b2;
		large = large > b3 ?large :b3;
		large = large > b4 ? large : b4;

		System.out.println(large);

		//WAPT TO CHECK SMALLEST OF FOUR NUMBERS

		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;

		int large1 = a1 < a2 ? a1 : a2;
		large1 = large1 < a3 ?large1 :a3;
		large1 = large1 < a4 ? large1 : a4;

		System.out.println(large1);






		
	}
}
