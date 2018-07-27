public class Root {
	
	public static int find(int n)
	{
		if(n<=1)
			return n;
		long start = 1;
		long end = n;
		int ans = 0;
		
		while(start<=end)
		{
			long mid = (start + end)/2;
			
			if(mid*mid==n)
				return (int)mid;
			if(mid*mid<n)
			{
				start = mid + 1;
				ans = (int)mid;
			}
			else
				end = mid - 1;
		}
		return ans;
	}
	
	public static long floorSqrt(int x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;
 
        // Do Binary Search for floor(sqrt(x))
        long start = 1, end = x/2; int ans=0;
        while (start <= end)
        {
            long mid = (start + end) / 2;
 
            // If x is a perfect square
            if (mid*mid == x)
                return mid;
 
            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = (int)mid;
            }
            else   // If mid*mid is greater than x
                end = mid - 1;
            
            //System.out.print(mid+" "+start+" "+end+" "+(mid*mid));
            //System.out.println();
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(find(2147395599));
	}

}
