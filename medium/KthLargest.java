public class KthLargest {
 
    public static int findKthLargest(int[] nums, int k) {
    		int start = 0;
    		int end = nums.length-1;
    		int index = nums.length-k;
    		
    		while(start<end)
    		{
    		int pivot = partition(nums,start,end);
    		
    		if(index<pivot)
    			end = pivot-1;
    		else if(index>pivot)
    			start = pivot+1;
    		else 
    			return nums[pivot];
    		}
    		return nums[start];
    }
     
    static int partition(int arr[], int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
    
    public static void main(String args[])
    {
    	int nums[] = {3,2,1,5,6,4};
    	int k=2;
    	System.out.println(kthSmallest(nums, 0, nums.length-1, k));
    	System.out.println(findKthLargest(nums, k));
    	
    }
    
}
