import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		//Method 1
		/*
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
		*/
		
		// Method 2
		int i = 0;
		int n = nums.length;
		int nums1[] = new int[n];
		
		for(int k=0;k<n;k++)
			nums1[k] = nums[k];
		
		Arrays.sort(nums);
		
		int output[] = new int[2];
		int num1 = 0, num2 = 0;
		int j = n-1;
		
		while(i<j)
		{
			int sum = nums[i]+nums[j];
			//System.out.println(nums[i]+" "+nums[j]);
			if(sum == target)
			{
				num1 = nums[i];
				num2 = nums[j];
				break;
			}
			else if(sum<target)
				i++;
			else
				j--;
		}
		int count = 0;
		//System.out.println(num1+" "+num2);
		boolean flag = false;
		for(int k=0;k<n;k++)
		{
			if(count==2)
				break;
			if(nums1[k]==num1 && !flag)
				{
				flag = true;
				output[0] = k;
				//System.out.println(k+" 1st"+" "+output[0]);
				count++;
				}
			
			else if(nums1[k]==num2)
			{
			output[1] = k;
			//System.out.println(k+" 2nd"+ output[1]);
			count++;
			}
		}
		//System.out.println(output[0]);
		
		return output;
    }
}
