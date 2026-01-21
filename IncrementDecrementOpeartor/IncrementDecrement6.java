class IncrementDecrement6
{
    public static void main(String[] args)
    {
        // -------- PART 1 --------
        int a = -2;
        int b = 5;
        int c = a++ + b-- - --a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // -------- PART 2 --------
        int x = -4;
        int y = 3;
        int z = --x + y++ * x-- + --y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


         // -------- PART 3 --------
		int p = -1;
        int q = 2;
        int r = p-- * ++q - --p + q++;

		System.out.println(p);
        System.out.println(q);
        System.out.println(r);
	}

	
}
