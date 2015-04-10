class Spiral
{
	public static void printSpiral(int[][] matrix)
	{
		if(matrix.length==0)
			return;

		if(matrix[0].length==0)
			return;

		int m = matrix.length;
		int n = matrix[0].length;

		int i=0,j=0;

		while(i<m)
		{
			System.out.println(matrix[i][j]);

			if(i%2==0)
			{
				j++;

				if(j==n)
				{
					j--;
					i++;
				}
			}
			else
			{
				j--;

				if(j==0)
				{
					j++;
					i++;
				}
			}

		}

	}
}