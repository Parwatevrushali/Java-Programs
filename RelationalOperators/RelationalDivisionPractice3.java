class RelationalDivisionPractice3 {
    public static void main(String[] args) {

        // Example 1: integer vs double
        System.out.println("Ex1: " + (12 / 5 == 12.0 / 5));  //FALSE

        // Example 2: char arithmetic
        System.out.println("Ex2: " + ('D' + 3 == 'G'));  //TRUE

        // Example 3: float vs int comparison
        System.out.println("Ex3: " + (7.5f / 2 < 7 / 2));  //FALSE

        // Example 4: float vs double equality with long decimals
        System.out.println("Ex4: " + (22.0f / 7 == 22.0 / 7));  //FALSE

        // Example 5: negative integer division
        System.out.println("Ex5: " + (-11 / 3 == -3));  //TRUE

        // Example 6: modulo vs division
        System.out.println("Ex6: " + (20 % 6 == 20 / 6)); //FALSE

        // Example 7: int vs float comparison
        System.out.println("Ex7: " + (9 / 4 == 2.25f)); //FALSE

        // Example 8: Infinity check
        System.out.println("Ex8: " + (1.0 / 0 == Double.POSITIVE_INFINITY));TRUE
    }
}
