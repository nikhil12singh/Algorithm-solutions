
public class MinimumMoves {

      public static int minMoves(int[] nums) {
        
    	  if(nums.length == 1)
    		  return 0;
    	  
    	  int min = nums[0];
    	  
    	  for(int num : nums)
    	     min = Math.min(num, min);
    	  
    	  int sum = 0;
    	  
    	  for(int num : nums)
    		  sum += (num - min);
    	  
    	  return sum;
            }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {83,86,77,15,93,35,86,92,49,21};
		System.out.println(minMoves(nums));
	}

}
