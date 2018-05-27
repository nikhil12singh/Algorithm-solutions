public class ProductArray {

    public int[] productExceptSelf(int[] nums) {
    
    	int temp = 1;
    	
    	int len = nums.length;
    	
    	int prod[] = new int[len];
    	
    	for(int i=0;i<len;i++)
    	{
    	prod[i] = temp;
    	temp *= nums[i];
    	}
    	
    	temp = 1;
    	
    	for(int i=len-1;i>=0;i--)
    	{
    	prod[i] *= temp;
    	temp *= nums[i];
    	}
    	
    return prod;
    }
}
