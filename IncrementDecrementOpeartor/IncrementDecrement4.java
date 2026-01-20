class  IncrementDecrement4
{
	public static void main(String[] args) 
	{
		int p = 5, q = -2, r = 4, s;

s = p-- * ++q + r--;
p = --p + s++ - q++;
q = q-- + ++r * p--;
r = r++ + p-- - --s;

System.out.println(p);
System.out.println(q);
System.out.println(r);
System.out.println(s);

	}
}
