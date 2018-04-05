class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
         double fill[][] = new double[101][101];
        fill[0][0] = poured;
        
    	for(int row=0; row<=query_row; row++)
    	{
    	for(int col = 0;col <= row; col++)	
    	{
    		double drop = (fill[row][col] - 1)/2;
    		
            if(drop>0)
            {
    		fill[row+1][col] += drop;
    		fill[row+1][col+1] +=drop;
    	}
        }
    	}
     	return Math.min(1,fill[query_row][query_glass]);
    }
}
