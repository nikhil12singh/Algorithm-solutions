public class Matrixzeros {
	
	public static void setZeroes(int[][] matrix) {
        
		int row = matrix.length;
		int col = matrix[0].length;
		boolean check_row = false;
		boolean check_col = false;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 && matrix[i][j]==0)
					check_row = true;
				if(j==0 && matrix[i][j]==0)
					check_col = true;
				if(matrix[i][j]==0)
					matrix[i][0] = matrix[0][j] = 0;
			}
		}
		
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<col;j++)
			{
				if(matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;
			}
		}
		
		System.out.println(check_row+" "+check_col);
		if(check_row)
		{
			for(int j=0;j<col;j++)
				matrix[0][j] = 0;
		}
		
		if(check_col)
		{
			for(int i=0;i<row;i++)
				matrix[i][0] = 0;
		}
    }
	
	public static void main(String args[])
	{
		int mat[][] = {{0,1,2,0},
				       {3,4,5,2},
				       {1,3,1,5}};
		
	setZeroes(mat);
	
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[0].length;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	}
}
