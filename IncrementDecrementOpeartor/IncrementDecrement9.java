class IncrementDecrement9 
{
	public static void main(String[] args) 
	{
		// Q7
        int a = -3;
        int b = 4;
        int c = a++ - --b * a--;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


		// Q8
        int x = 2;
        int y = 3;
        int z = x++ + ++y * x-- - --y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// Q9
        int i = -2;
        int j = i-- - --i * i++;

		System.out.println(i);
		System.out.println(j);
		

		// Q10
        int m = 1;
        int n = -2;
        int r = m++ - n-- * --m + ++n;

		System.out.println(m);
		System.out.println(n);
		System.out.println(r);






	}
}
