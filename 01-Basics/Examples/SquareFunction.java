class Rectangle
{
	
	public static void main(String args[])
	{
		System.out.println("Program started");
		
		
		System.out.println("Area of Rect: "+ rectArea(10,15));
		
		System.out.println("Perimeter of Rect: "+ rectPerimeter(10,15));
	
	
		System.out.println("Program ended");	
	}
	
	static int rectArea(int len, int wid) // -----> Multiple Arguments
	{
		int area = len*wid;
	 
		return area; //return area,perimeter; ---> ERROR
	}
	
	static int rectPerimeter(int len, int wid)
	{
		int perimeter = 2*(len+wid); 
		
		return perimeter;
	}
}