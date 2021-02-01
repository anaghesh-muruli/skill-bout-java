import java.util.Scanner;

class UserInput
{
	public static void main(String args[])
	{	
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = s1.nextInt(); 
		System.out.println("The entered value is: "+ num);
		
		System.out.println("Enter a string");
		String s = s1.next();
		System.out.println("The entered value is: "+ s);
			
	}
}