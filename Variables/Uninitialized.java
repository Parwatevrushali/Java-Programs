class Uninitialized
{
    public static void main(String[] args)
    {
        // We cannot use local variable without initialization
        // because local variables are not assigned default values

        double d;
        // System.out.println(d); // Compile Time Error

        // Correct usage
        d = 10.5;
        System.out.println(d); // 10.5
    }
}
