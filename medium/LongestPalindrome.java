
public class LongestPalindrome {

    public static int recur_longestPalindromeSubseq(String s, int i, int j) {
        
    	if(i==j)
    		return 1;
    	
    	if(s.charAt(i) == s.charAt(j) && (i+1==j))
    		return 2;
    	
    	if(s.charAt(i) == s.charAt(j))
    		return recur_longestPalindromeSubseq(s, i+1, j-1);
    	
    	return Math.max(recur_longestPalindromeSubseq(s, i+1, j), recur_longestPalindromeSubseq(s, i, j-1));
    }
    
    public static int dp_longestPalindromeSubseq(String s, int i, int n)
    {
    	int dp[][] = new int[n][n];
    
    	for(int p=0;p<n;p++)
    		dp[p][p] = 1;
    	
    	for(int l = 2;l<=n;l++)
    	{
    		for(int p=0;p<(n-l+1);p++)
    		{
    			int q = p + l - 1;
    			
    			if(s.charAt(p)==s.charAt(q) && l == 2)
    				dp[p][q] = 2;
    			else if(s.charAt(p)==s.charAt(q))
    				dp[p][q] = dp[p+1][q-1] + 2;
    			else
    				dp[p][q] = Math.max(dp[p+1][q], dp[p][q-1]);		
    		}
    	} 	
    	return dp[0][n-1];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abba";
		System.out.println(recur_longestPalindromeSubseq(str, 0 , str.length()-1));
		System.out.println(dp_longestPalindromeSubseq(str, 0 , str.length()));
	}

}
