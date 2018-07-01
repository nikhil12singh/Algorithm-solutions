public class Jump {
	
	public static boolean canJump(int[] nums) {
		
		int n = nums.length;
		int reach = n-1;
		
		for(int i=n-2;i>=0;i--)
		{
			if(nums[i]+i>=reach)
				reach = i;
		}
		return reach==0;
    }
	
	public static void main(String[] args) {
	int nums[] = {1,2,0,1,4};
	System.out.println(canJump(nums));
	}
}
