class FunctionDemo
{
	static void test1()
	{
		System.out.println("Running test1 function...");
		test2();
		test3();
		
	}
	
	static void test2()
	{
		System.out.println("Running test2 function...");
		test4();
	}
	static void test3()
	{
		System.out.println("Running test3 function...");

	}
	static void test4()
	{
		System.out.println("Running test4 function...");

	}
	
	public static void main(String args[])
	{	
		System.out.println("Program started");
		test1();
		System.out.println("Program ended");
	}
}