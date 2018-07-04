import java.util.Arrays;

public class CoinChange {
	
	public static int coinChange(int[] coins, int amount) {

	   // Method 1
      /* int res = Integer.MAX_VALUE;
       if(amount == 0)
    	   return 0;
       
       for(int i=0;i<coins.length;i++)
       {
    	   	if(coins[i]<=amount) {
    	   	int sub_res = coinChange(coins, amount - coins[i]);
    	   	if(sub_res!=Integer.MAX_VALUE && sub_res+1<res)
    	   		res = sub_res+1;
    	   	}
       }
       return res;
       */
		
		// Method 2
		int res = Integer.MAX_VALUE;
		int dp[] =  new int[amount+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i=1;i<=amount;i++)
		{
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]<=i)
				{
					int sub_res = dp[i-coins[j]];
					if(sub_res!=Integer.MAX_VALUE && sub_res+1<dp[i])
						dp[i] = sub_res + 1;
				}
			}
		}
		return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
	
	public static void main(String[] args) {
		int coins[] = {2};
		System.out.println(coinChange(coins, 3));
		}
}
