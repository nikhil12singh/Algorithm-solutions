public class Islands {
	
	public int numIslands(char[][] grid) {
        int row = grid.length, col = 1;
		if(row>=1)
			col = grid[0].length;
		int count = 0;

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(grid[i][j]=='1')
				{
					check(grid,i,j,row,col);
					count++;
				}
			}
		}
		return count;
    }
	
	public static void check(char[][]grid, int i,int j, int row, int col)
	{
		int rows[] = {0,0,-1,1};
		int cols[] = {-1,1,0,0};
		
		for(int k=0;k<4;k++)
		{
			if(check_range(i+rows[k],j+cols[k],row,col) && grid[i+rows[k]][j+cols[k]]=='1')
			{
				grid[i+rows[k]][j+cols[k]] = 0;
				check(grid, i+rows[k], j+cols[k], row, col);
				
			}
		}
	}
	
	public static boolean check_range(int i, int j, int row, int col)
	{
		return ((i>=0 && j>=0 && i<row && j<col)?true:false);
	}
}
