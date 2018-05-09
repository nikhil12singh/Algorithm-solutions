import java.util.HashMap;

public class Sum4 {

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
    	HashMap<Integer, Integer> hm = new HashMap<>();
    	int n = A.length;
    	
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)	
    		{
    			int sum = A[i] + B[j];
    			hm.put(sum, hm.getOrDefault(sum, 0)+1);
    		}
    	}
    	
    	int result = 0;
    	
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)	
    		{
    			int sum = C[i] + D[j];
    			result += hm.getOrDefault(-1*sum, 0);
    		}
    	}
    	return result;
    }
}
