import java.util.Scanner;
class CheckZeroInNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong(); // using long to handle large numbers
        
        boolean found = false;
        
        
        // Check each digit
        while (num > 0) {
            long digit = num % 10;
            if (digit == 0) {
                found = true;
                break;
            }
            num /= 10;
        }

        // Print result
        if (found) {
            System.out.println(num + " contains 0.");
        } else {
            System.out.println(num + " does not contain 0.");
        }
        
        sc.close();
    }
}
