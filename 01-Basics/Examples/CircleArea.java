class CircleArea
{
	
	public static void main(String args[])
	{
		System.out.println("Program started");
		
		double x = circleArea(5);
	
		System.out.println("Area of circle is: "+ x);	
		System.out.println("Area of circle is: "+circleArea(10));	
	
		System.out.println("Program ended");	
	}
	
	static double circleArea(int radius) 
	{
		final double PI = 3.141;
		
		double area = PI * radius * radius;
	 
		return area; //return area,perimeter; ---> ERROR
	}
	
}