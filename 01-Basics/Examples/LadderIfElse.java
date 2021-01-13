class LadderIfElse
{
	public static void main(String args[])
	{
		System.out.println("Prog started");
		int x = 10;

		if(x < 10)
		{
			x++;
			System.out.println("Value of x is less that 10");
		}	
		else if(x > 10)
			System.out.println("Value of x is greater that 10");
		else
			System.out.println("Value of x is equal 10");

		System.out.println("Prog Ended");
	}
}