
class Runner 
{
	public static void main(String[] args) 
	{
		double kilometer = 14;
		double minutes = 45;
		double seconds = 30;

		//convert kilogram into miles 

		double miles = 14 / 1.6;

		//convert time into hours

		double hours = minutes / 60 + seconds / 3600.0;
		
       // Calculate average speed
		double averageSpeed = miles / hours;

		// Output
		System.out.println("Average speed in miles per hour is: " + averageSpeed);
	

		
	}
}
