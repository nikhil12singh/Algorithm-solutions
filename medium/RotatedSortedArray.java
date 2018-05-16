
public class RotatedSortedArray {
	 public int findMin(int[] nums) {
		    int n = nums.length;
		        
		        int left = 0;
		        int right = nums.length-1;
		        int min = Integer.MAX_VALUE;
		        
		        while(left<=right)
		        {
		        int mid = (left + right)/2;
		        min = Math.min(min, nums[mid]);
		        
		        if(nums[left]<nums[mid])
		        {
		        	min = Math.min(min, nums[left]);
		        	left = mid + 1;
		        }
		        else if(nums[mid]<nums[right])
		        {
		        	right = mid - 1;
		        }
		        else
		        	left++;
		        }
		        return min;  
		    }
}
