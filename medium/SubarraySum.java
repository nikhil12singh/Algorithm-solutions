public class SubarraySum {

	public int minSubArrayLen(int s, int[] nums) {
        
		if(nums.length==0)
			return 0;
		int len = nums.length;
		int sum = 0;
		int curlen=0, minlen = Integer.MAX_VALUE;
		
		for(int i=0;i<len;i++)
		{
			sum+=nums[i];
			curlen++;
			// System.out.println(sum+" "+minlen+" "+curlen);
			while(sum>=s)
			{
                if(minlen>curlen)
				minlen = curlen;
				sum-=nums[i-curlen+1];
				curlen--;
              // System.out.println();
			}
           
		}
		return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
}
