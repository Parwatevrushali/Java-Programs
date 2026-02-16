import java.util.Scanner;
class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int evenCount = 0;
        int oddCount = 0;
        int temp = num; // to preserve original number
        
        while (temp != 0) {
            int digit = temp % 10; // extract last digit
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            temp /= 10; // remove last digit
        }
        
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
