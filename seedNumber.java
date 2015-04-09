public class getSeedNumber
{
	public static long product(int n)
	{
		int result = n;

		while(n!=0)
		{
			result *= n%10;
			n/=10;
		}
		return result;
	}


	public static void getSeedNumber()
	{
		int n = 42;

		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				if(product(i)==n)
					System.out.println(i);
				if(n/i!=i && product(n/i)==n)
					System.out.println(n/i);
			}
		}
	}
}