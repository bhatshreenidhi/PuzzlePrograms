class ZigZag
{
	public static void printZigZag()
	{
		int[][] matrix = {{1, 9, 21, 13},
                {3, 7, 8,  -1},
                {13, 5, 2,   1},
                {5,-7, 3,  6}};

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

				if(j==-1)
				{
					j++;
					i++;
				}
			}

		}

	}
}