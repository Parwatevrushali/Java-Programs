class IncrementDecrement8 
{
	public static void main(String[] args) 
	{
		// Q1
        int a = 1;
        int b = a++ + ++a;

		System.out.println(a);
		System.out.println(b);


		// Q2
        int x = -2;
        int y = x-- + x++;

		System.out.println(x);
		System.out.println(y);


		// Q3
        int p = 3;
        int q = --p + p-- + ++p;


		System.out.println(p);
		System.out.println(q);

		// Q4
        int m = 5;
        int n = m++ + m++ + ++m;

		System.out.println(m);
		System.out.println(n);

		// Q5
        int r = -1;
        int s = ++r + r++ + --r;

		System.out.println(r);
		System.out.println(s);

		// Q6
       int u = 2;
       int v = u-- * u++ + --u;

	   System.out.println(u);
		System.out.println(v);








	}
}
