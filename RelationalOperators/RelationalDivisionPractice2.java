class RelationalDivisionPractice2 {
    public static void main(String[] args) {

        // Example 1: 
        System.out.println("Ex1: " + (8 / 3 == 8.0 / 3)); //false

        // Example 2: char arithmetic
        System.out.println("Ex2: " + ('Z' - 25 == 'A'));  //true

        // Example 3: mixed type comparison
        System.out.println("Ex3: " + (4.5f / 2 > 4 / 2));  //true

        // Example 4: float vs double equality
        System.out.println("Ex4: " + (5.0f / 2 == 5.0 / 2)); //false

        // Example 5: negative integer division
        System.out.println("Ex5: " + (-9 / 4 == -2)); //true

        // Example 6: division + modulo
        System.out.println("Ex6: " + (17 / 4 == 17 % 4)); //false

        // Example 7: comparing int and float
        System.out.println("Ex7: " + (6 / 3 == 2.0f)); //true

        // Example 8: tricky infinity / NaN
        System.out.println("Ex8: " + ((0.0 / 0.0) == Double.NaN));//false
    }
}
