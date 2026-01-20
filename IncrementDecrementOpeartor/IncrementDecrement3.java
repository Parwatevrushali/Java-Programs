class  IncrementDecrement3
{
	public static void main(String[] args) 
	{
		int a = -4, b = 6, c = 3, d;

d = a++ + --b * c;
a = a-- + ++c - b--;
b = ++a * c-- - d;
c = c++ + a-- - --b;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);

	}
}
