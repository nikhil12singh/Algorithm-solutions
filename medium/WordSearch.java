
public class WordSearch {

	boolean res = false;
	
	public boolean exist(char[][] board, String word) {
	boolean[][] flag = new boolean[board.length][board[0].length];
	char[] c = word.toCharArray();

	    for(int i=0;i<board.length;i++)
	        for(int j=0;j<board[0].length;j++){
	            if(board[i][j]!=c[0])
	                continue;
	            search(c,0,board,i,j,flag);
	            if(res)
	                return true;
	            
	        }
	    return false;
	}
	private void search(char[] c,int i,char[][] board,int curRow,int curCol,boolean[][]flag){
	    if(res||i==c.length){
	        res = true;
	        return;
	    }
	    if(curRow<0||curRow>=board.length||curCol<0||curCol>=board[0].length||flag[curRow][curCol]||board[curRow][curCol]!=c[i])
	        return;
	    
	    flag[curRow][curCol] = true;
	   //the order below has significant influence on time complexity  
	    search(c,i+1,board,curRow,curCol+1,flag);//right
	    search(c,i+1,board,curRow+1,curCol,flag);//down
	    search(c,i+1,board,curRow,curCol-1,flag);//left
	    search(c,i+1,board,curRow-1,curCol,flag);//up
	    
	    flag[curRow][curCol] = false;
	}
	/*
    public static boolean exist(char[][] board, String word) {
    	
    	boolean visited[][] = new boolean[board.length][board[0].length];
    	
    	for(int i=0;i<board.length;i++)
    	{
    		for(int j=0;j<board[i].length;j++)
    		{
    	      if(board[i][j]!=word.charAt(0))
    	    	  continue;
    	    	  else 
    	    		  {
    	    		  if(find(board,i,j,word,1,visited))
    	    		  return true;
    	    		  }
    		}
    	}
    	return false;
    }
    
    public static boolean find(char[][] board, int i, int j, String word,int c, boolean visited[][])
    {
    	int row[] = {-1,1,0,0};
    	int col[] = {0,0,-1,1};
    	
    	if(c==word.length())
    		return true;
    	
    	for(int p=0;p<4;p++)
    	{
    		//if(isValid(i+row[p],j+col[p],board))
    		//	System.out.println(visited[i+row[p]][j+col[p]]+" "+(i+row[p])+" "+(j+col[p])+" word "+word.charAt(c)+" == "+board[row[p]+i][col[p]+j]);
    	       if(c<word.length() && isValid(i+row[p],j+col[p],board) && !visited[i+row[p]][j+col[p]] && board[row[p]+i][col[p]+j]==word.charAt(c))
    	       {
    	    	   visited[i][j]  = true;
    	    	   System.out.println(word.charAt(c)+" "+i+" "+j+" "+c);
    	    	   return find(board, i+row[p], j+col[p], word, c+1,visited);
    	       }
    	       visited[i][j] = false; 	      
    	}
    	return false;
    }
    
    public static boolean isValid(int a, int b, char board[][])
    {
    return (a<board.length && a>=0 && b<board[0].length && b>=0)	? true : false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char board[][] =
			{
				{'C','A','A'},
				{'A','A','A'},
				{'B','C','D'}
					
			};
		
		String word = "AAB";
		
		System.out.println(exist(board, word));
	}
*/
}
