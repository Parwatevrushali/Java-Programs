class ConditionalOperator1 
{
	public static void main(String[] args) 
	{
	//WAPT check weather given no is positive or negaive

	 int num = 34;
	 String ans = num>0 ? "It is positive" : "It is negative";
	 System.out.println(ans);     //It is positive


	 int m1 = 0;
	 String m2 =  m1 > 0 ? "It is positive" : (m1 < 0 ? "It is negative" : "It is zero");
	 System.out.println(m2);   //It is zero




	 //WAPT check given no is even or odd

	 int n = 23;
	 String res = n%2==0 ? "It is even" : "It is odd";
	 System.out.println(res);        //It is odd 


	 //WAPT find Largest of two numbers

	 int n1 = 34;
	 int n2 = 345;
	 int answer = n1 > n2 ? n1 : n2;
	 System.out.println(answer);     //345


	 //WAPT find Smallest of two numbers

	 int n3 = 48;
	 int n4 = 98;
	 int n5 = n3<n4 ? n3 :n4;
	 System.out.println(n5);      //48


	 //WAPT find Largest of three numbers

	 int b1 = 20;
	 int b2 = 50;
	 int b3 = 25;
     int b4 = (b1 > b2) ? (b1 > b3 ? b1 : b3) : (b2 > b3 ? b2 : b3) ;
	 System.out.println("Largest no is :"+ b4);      //Largest no is :50 


	 //WAPT find Smallest of three numbers 

	 int a =35;
	 int b =40;
	 int c= 15;
	 int d = (a<b) ? (a < c ? a : c) : (b < c ? b : c);
	 System.out.println("Smallest no is :"+d);      //Smallest no is :15


	}
}
