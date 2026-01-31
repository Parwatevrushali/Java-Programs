class  Vrushali
{
	public static void main(String[] args) 
	{

      
        int x = 1;
        int y = 2;
        int z = 3;
        String s = x++ + y * z + "" +
                   ++x + y-- / z +
                   (x + y + z);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z + ", s = " + s);
    

	}
}
