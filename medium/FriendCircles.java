import java.util.HashSet;

public class FriendCircles {

    public static int findCircleNum(int[][] M) {
       
    	int n = M.length;
    	int count = 0;
    	boolean check[] = new boolean[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    		  if(check[i]==false)
    		  {
    			  count++;
    			  recur(M,i,n,check);
    		  }
    		}
    	} 	
    	return count;
    }
    
    public static void recur(int M[][], int i, int n,boolean check[])
    {
    check[i] = true;
    
    	for(int j=0;j<n;j++)
    {
    	if(M[i][j]==1 && check[j]==false)
    	{
    		recur(M, j, n, check);
    	}
    }
    
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = {{1,0,0,1},
				       {0,1,1,0},
				       {0,1,1,1},
				       {1,0,1,1}};
		
		System.out.println(findCircleNum(mat));
		
	}

}
