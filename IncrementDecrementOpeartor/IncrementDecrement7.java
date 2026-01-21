class  IncrementDecrement7
{
	public static void main(String[] args) 
	{
		{

		int a = -1;
        int b = 2;
        int c = a++ + b++ - --a;

		System.out.println(a);
        System.out.println(b);
        System.out.println(c);

		int x = 3;
        int y = -2;
        int z = x-- * ++y + x++;

		System.out.println(x);
        System.out.println(y);
        System.out.println(z);


		int p = -2;
        int q = -3;
        int r = ++p - q-- * p--;

		System.out.println(p);
        System.out.println(q);
        System.out.println(r);



		int m = 4;
        int n = -1;
        int s = --m + n++ - m--;

		System.out.println(m);
        System.out.println(n);
        System.out.println(s);


		int i = -3;
        int j = 5;
        int k = i++ - --j * i--;

		System.out.println(i);
        System.out.println(j);
        System.out.println(k);











    }
	}
}
