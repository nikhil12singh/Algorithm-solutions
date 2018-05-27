public class HouseRobber {

    public int rob(int[] nums) {
        
    	int incl = nums[0];
    	int excl = 0;
    	int excl_cur = 0;
    	
    	for(int i=1;i<nums.length;i++)
    	{
    	excl_cur = Math.max(incl, excl);
    	incl = nums[i] + excl;
    	excl = excl_cur;
    	}
    	return Math.max(incl, excl);
    }
}
