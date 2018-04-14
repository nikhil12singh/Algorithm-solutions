import java.util.Arrays;
import java.util.Stack;

public class LargestSumOfAverages {

public double largestSumOfAverages(int[] A, int K) {
        
	double sum[] = new double[A.length+1];
	double dp[] = new double[A.length+1];
	
	for(int i=0;i<A.length;i++)
		sum[i+1] = A[i] + sum[i];
	
	for(int i=0;i<A.length;i++)
		dp[i] = (sum[A.length] - sum[i])/(A.length-i);; 
	
	for(int k=0;k<K-1;k++)
	{
	for(int i=0;i<A.length;i++)
	{
	for(int j=i+1;j<A.length;j++)
	{
		dp[i] = Math.max(dp[i], (sum[i] - sum[j])/(i-j) + dp[j]);	
	}
	}
	}
	return dp[0];
    }
}
