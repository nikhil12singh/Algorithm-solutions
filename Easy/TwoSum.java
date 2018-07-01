import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		
		int n = nums.length;
		boolean flag = false;
		int output[] = new int[2];
		
		for(int i=0;i<n-1;i++)
		{
			if(flag)
				break;
			for(int j=i+1;j<n;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					flag = true;
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}
		return output;
    }
}
