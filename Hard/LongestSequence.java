import java.util.HashSet;

public class LongestSequence {
	
	public static int longestConsecutive(int[] nums) {
		 HashSet<Integer> set = new HashSet<>();
			
	        if(nums.length ==1 || set.size()==1)
	            return 1;
	        
	        if(nums.length == 0)
	            return 0;
			
	        for(int i=0;i<nums.length;i++)
				set.add(nums[i]);
			
			int count = 0, max = Integer.MIN_VALUE;
			
			for(int i=0;i<nums.length;i++)
			{
				count = 0;
				
				if(set.contains(nums[i]+1))
				{
					count++;
					int j = nums[i] + 1;
					
					while(set.contains(j)){
						j = j+1;
						count++;
					}
					
				if(max<(count))
					max = count;
				}
			}
			return (max>1)?max:1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0};
		System.out.println(longestConsecutive(nums));
		
	}

}
