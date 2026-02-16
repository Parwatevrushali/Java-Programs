class Rectangle1
{
	public static void main(String[] args) 
	{
		double width = 4.5;
		double height = 7.9;

		final double AREA = width * height ;
		final double PERIMETER = 2 * (height + width);

		System.out.printf("Area of Rectangle: %.2f %n", AREA);
        System.out.printf("Perimeter of Rectangle: %.2f %n", PERIMETER);

	}
}
