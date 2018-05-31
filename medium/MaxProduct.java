public class MaxProduct {

	public static int maxProduct(int[] nums) {
        int len = nums.length;
        
		if(nums.length==0)
			return 0;
		int left = 1, max = Integer.MIN_VALUE;
		
		for(int i=0;i<len;i++)
		{
			left *= nums[i];
			
			max = Math.max(left, max);
			
			if(left==0)
				left = 1;
		}
        
       int right = 1;
       
       for(int i=len-1;i>=0;i--)
       {
    	   right *= nums[i];
    	   
    	   max = Math.max(right, max);
    	   
    	   if(right==0)
    		   right = 1;
       }
        
       return max;
    }
	
	public static void main(String args[])
	{
		int arr[] = {2,3,-2,4};
		
		System.out.println(maxProduct(arr));
	}
	
}
