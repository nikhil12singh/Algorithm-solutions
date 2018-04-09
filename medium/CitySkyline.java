
public class CitySkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
       
    	int top[] = new int[grid[0].length];
    	int left[] = new int[grid.length];
    	
    	for(int i=0;i<grid.length;i++)
    	{
    		int maxcol = -1;
    	for(int j=0;j<grid[0].length;j++)
    	{
    if(grid[i][j]>maxcol)
    	maxcol = grid[i][j];
    	}
    	left[i] = maxcol;
    	}
    	
    	for(int i=0;i<grid[0].length;i++)
    	{
    		int maxrow = -1;
    	for(int j=0;j<grid.length;j++)
    	{
    if(grid[j][i]>maxrow)
    	maxrow = grid[j][i];
    	}
    	top[i] = maxrow;
    	}
    	
    	int sum = 0;
    	
    	for(int i=0;i<grid.length;i++)
    	{
    	for(int j=0;j<grid[0].length;j++)
    	{
    	sum += Math.min(top[j], left[i]) - grid[i][j];
    	System.out.println(sum);
    	}
    	}
    	return sum;
    	
    }
    	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		
		System.out.println(maxIncreaseKeepingSkyline(mat));
	}

}
