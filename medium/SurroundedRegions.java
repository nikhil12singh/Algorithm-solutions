import java.util.LinkedList;
import java.util.Queue;


class Solution {
    class Point{
	
		int x;
		int y;
		
		Point(int x, int y)
		{
	       this.x = x;
	       this.y = y;
	       
		}
	}
	
    public void solve(char[][] board) {
        
        if(board.length==0)
            return;
    	int rows = board.length;
    	int cols = board[0].length;
    	int xdir[] = {-1,1,0,0};
    	int ydir[] = {0,0,-1,1};
    	
    	for(int i=0;i<rows;i++)
    	{
    		for(int j=0;j<cols;j++)
    		{
    	        if((i==0 || i==(rows-1) || j==0 || j==(cols-1)) && (board[i][j] == 'O'))
    	        {
    	        	   Queue<Point> queue = new LinkedList<>();
    	        	   board[i][j] = 'P';
    	        	   queue.offer(new Point(i,j));
    	        	   
    	        	   while(!queue.isEmpty())
    	        	   {
    	        	   Point point = queue.remove();
    	        	   
    	        	   for(int k=0;k<4;k++)
    	        	   {
    	        		   int x = xdir[k] + point.x;
    	        		   int y = ydir[k] + point.y;
    	        		   
    	        		   if(x>=0 && x< rows && y>=0 && y< cols && board[x][y]=='O')
    	        		   {
    	        			   board[x][y] = 'P';
    	        			   queue.offer(new Point(x,y));
    	        		   }
    	        	   }
    	        	   }
    	        }
    		}
    	}
    	
    	for(int i=0;i<rows;i++)
    	{
    		for(int j=0;j<cols;j++)
    		{
    			if(board[i][j]=='P')
    				board[i][j] = 'O';
    			else if(board[i][j]=='O')
    				board[i][j] = 'X';
    		}
    	}
    		}
}