public class ClimbingStairs {
	
	public static int climbStairs(int n) {
        /* Method 1
		int count = 0;
		if(n<=1)
			return 1;
		
		count += climbStairs(n-1) + climbStairs(n-2);
		
		return count;
		*/
		
		// Method 2
		int a = 0;
		int b = 1;
		int c = 1;
		int i = 1;
		
		while(i++<=n)
		{
			c = a+b;
			a = b;
			b = c;
		}
		return c;	
	}
}
