class IncrementDecrement5 {

	/*
 * This program demonstrates increment (++) and decrement (--)
 * operators in Java using simple to complex examples.
 * 
 * These examples are commonly asked in Java interviews
 * and help understand operator precedence and evaluation order.
 */

    public static void main(String[] args) {

        // Example 1: Post-increment
        {
            int a = 5;
            System.out.println(a++); // 5
            System.out.println(a);   // 6
        }

        // Example 2: Pre and Post increment with negative value
        {
            int b = -3;
            System.out.println(++b); // -2
            System.out.println(b++); // -2
            System.out.println(b);   // -1
        }

        // Example 3: Post-increment in expression
        {
            int x = 10;
            x = x++ + 1;
            System.out.println(x);   // 11
        }

        // Example 4: Post-decrement
        {
            int p = 4;
            p = p-- - 1;
            System.out.println(p);   // 2
        }

        // Example 5: Mixed increment operators
        {
            int a = 3, b = 5;
            int c = a++ + ++b;
            System.out.println(a);   // 4
            System.out.println(b);   // 6
            System.out.println(c);   // 9
        }

        // Example 6: Increment & decrement together
        {
            int m = -2, n = 4;
            int r = ++m - n--;
            System.out.println(m);   // -1
            System.out.println(n);   // 3
            System.out.println(r);   // -5
        }

        // Example 7: Multiple increments on same variable
        {
            int x = 7;
            x = ++x + x++;
            System.out.println(x);   // 16
        }

        // Example 8: Complex expressions
        {
            int a = -3, b = 6, c;
            c = a++ + --b;
            a = ++a - b--;
            System.out.println(a);   // -1
            System.out.println(b);   // 4
            System.out.println(c);   // 2
        }

        // Example 9: Operator precedence
        {
            int p = 4, q = -2, r;
            r = p-- * ++q;
            q = q++ + p--;
            System.out.println(p);   // 2
            System.out.println(q);   // -1
            System.out.println(r);   // -4
        }

        // Example 10: Very tricky expression
        {
            int x = 5;
            x = x++ * ++x;
            System.out.println(x);   // 36
        }

        // Example 11: Increment with precedence
        {
            int a = 2, b = 3, c;
            c = a++ + a++ * ++b;
            System.out.println(a);   // 4
            System.out.println(b);   // 4
            System.out.println(c);   // 14
        }

        // Example 12: Interview-level tricky question
        {
            int p = -3, q = 5, r = 2;
            r = p++ - q-- * ++r;
            q = --p + r++ - --q;
            System.out.println(p);
            System.out.println(q);
            System.out.println(r);
        }

        // Example 13: Extreme combination
        {
            int x = -2, y = 4, z = 3, s;
            s = x++ * --y + z--;
            y = y-- + ++x * s--;
            x = --x + y++ - z--;
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(s);
        }

        // Example 14: Same variable used multiple times
        {
            int a = 3;
            a = a++ + ++a + a--;
            System.out.println(a);
        }

        // Example 15: Final complex chain
        {
            int a = 7, b = 9, c = 3, d = 2;

            d = a++ - b-- + ++c;
            b = d++ + a++ + c++;
            c = b-- + --a + d--;
            a = --b + a++;

            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);

		}

			 


			{
				int a = 5;
int b = a++ + ++a;
System.out.println(a);
System.out.println(b);
			}

       
    }
}
