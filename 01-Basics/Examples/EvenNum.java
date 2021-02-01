class EvenNum
{
	public static void main(String args[])
	{	
		//Print all the even numbers from 0 to 100 (NOT between 0 and 100)
		for(int i = 0; i < 101 ; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}