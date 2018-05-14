
public class MinPathSum {

    public static int minPathSum(int[][] grid) {              // Dynamic Programming method
    
    	int m = grid.length;
    	int n = grid[0].length;
    	
    	int min = Integer.MAX_VALUE;
    	int cost[][] = new int[m+1][n+1];
    	cost[0][0] = grid[0][0];
    	
    	for(int j=1;j<n;j++)
    		cost[0][j] = grid[0][j] + cost[0][j-1];
    	
    	for(int i=1;i<m;i++)
    		cost[i][0] = grid[i][0] + cost[i-1][0];
    	
    	for(int i=1;i<m;i++)
    	{
    		for(int j=1;j<n;j++)
    		{
    			cost[i][j] = grid[i][j] + Math.min(cost[i][j-1], cost[i-1][j]);
    		}
    	}
    	
    	return cost[m-1][n-1];
    }
    
   
    public static int minPathSum_recur(int grid[][], int m, int n)           //By Recursion
    {
    if(m<0 || n<0)
    	return Integer.MAX_VALUE;
    
    if(m==0 && n==0)
    	return grid[m][n];
    
    return grid[m][n]+Math.min(minPathSum_recur(grid, m, n-1), minPathSum_recur(grid, m-1, n));				
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grid[][] = {
		  {1,3,1},
		  {1,5,1},
		  {4,2,1}
		};
		
		System.out.println(minPathSum(grid));
		System.out.println(minPathSum_recur(grid,grid.length-1,grid[0].length-1));
	}

}
