public class GameOfLife {
	public void gameOfLife(int[][] board) {
     	int row = board.length;
	    	int col = board[0].length;
	    	
	    	for(int i=0;i<row;i++)
	    	{
	    		for(int j=0;j<col;j++)
	    		{
	    			int count_lives = lives(board, row, col, i, j);
                    if(i==2 && j==2)
	    			System.out.println(count_lives);
	    			if(board[i][j]==1 && count_lives>=2 && count_lives<=3)
	    				board[i][j] = 3;
	    			else if(board[i][j]==0 && count_lives==3)
	    				board[i][j] = 2;
	    			
	    		}
	    	}
	    	
	    	for(int i=0;i<row;i++)
	    	{
	    		for(int j=0;j<col;j++)
	    		{
	    				board[i][j] = board[i][j]>>1;
	    		}
	    		}
	    }
	    
	    public int lives(int board[][], int row, int col, int i, int j)
	    {
	    		int up[] = {-1,-1,-1,1,1,1,0,0};
	    		int down[] = {-1,0,1,-1,0,1,-1,1};
	    		int count = 0;
	    		
	    		for(int k=0;k<8;k++)
	    		{
	    			if(i+up[k]>=0 && i+up[k]<row && j+down[k]>=0 && j+down[k]<col)    
	    					count += 1 & board[i+up[k]][j+down[k]]; 
	    		}
	    		return count;
	    }
}
