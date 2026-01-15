class Modulus
{
	public static void main(String[] args) 
	{

 // Demonstrates Modulus operator (%) with all Java data types
 //for byte % byte
      byte b1 = 10;
	  byte b2 =5;

	  int res = b1%b2;
	  System.out.println(res);        //0



//for short %short
	  short s1 = 500;
	  short s2 = 300;

	  int ans = s1%s2;
	  System.out.println(ans);       //200

//for int%int
	  int i1 = 2000;
	  int i2 = 1000;

	  int answer = i1%i2;
	  System.out.println(answer);   //0

//for char % char
      char ch1='b';
	  char ch2='a';

	  int ch3=ch1%ch2;
	  System.out.println(ch3);    //1

//for long % long
      long l1 = 5000000000l;
	  long l2 = 300000000l;

	  long l3 = l1%l2;
	  System.out.println(l3);    //200000000

//for float % float
      float f1 = 2.2f;
	  float f2 = 1.1f;

	  float f3 = f1%f2;
	  System.out.println(f3);   //0.0


//for double % double
      double d1 = 2.2;
	  double d2 = 1.1;

	  double d3 = d1%d2;
	  System.out.println(d3);    //0.0

//for boolean % boolean it will show compile time error 
     /* boolean t1 = true;
	  boolean t2 = false;

	  boolean t3 = t1%t2;
	  System.out.println(t3);  //CTE bad operand types  


//for String % String  it will show compile time error 
       String n1 = "Qspider";
	   String n2 = "Deccan";

	   String n3 = n1%n2;
	   System.out.println(n3);  // CTE bad operand types */



		
	}
}


