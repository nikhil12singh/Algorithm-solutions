
public class Matrix {

public static int[][] updateMatrix(int[][] matrix) {
        
    	int row = matrix.length;
    	int col = matrix[0].length;
    	int max = row*col;
    	int dp[][] = new int[row][col];
    	
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
              
    	       		if(matrix[i][j] != 0)
    	       		{
    	       			int up = i>0? dp[i-1][j]:max;
    	       			int left = j>0 ? dp[i][j-1]:max;
    	       			dp[i][j] = 1+Math.min(up, left);
    	       		}
    		}
    	}
    	
    	for(int i = row - 1;i>=0;i--)
    	{
    		for(int j= col-1;j>=0;j--)
    		{
               
    	      if(matrix[i][j]!=0)
    	      {
    	    	  int down = i<row-1?dp[i+1][j]:max;
    	    	  int right = j<col-1?dp[i][j+1]:max;
    	    	  dp[i][j] = Math.min(Math.min(down,right)+1,dp[i][j]);
    	      }
    		}
    	}
    	
    	return dp;
    }
}
