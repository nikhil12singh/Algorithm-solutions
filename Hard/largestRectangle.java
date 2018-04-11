import java.util.Arrays;
import java.util.Stack;

public class Solution {

	 static long largestRectangle(int[] h) {
	        // Complete this function
		
		Stack<Integer> stack = new Stack<>();
		
		long area = 0;
		long maxarea = 0;
		int i = 0;
		int top;
		
		while(i<h.length)
		{
		if(stack.isEmpty() || h[stack.peek()]<h[i])
		{
			stack.push(i);
			i++;
		}
		else
		{
			top = stack.pop();
			
			area = stack.isEmpty()?h[top]*i:h[top]*(i-stack.peek()-1);
			
			if(area<maxarea)
				maxarea = area;
			
		}
		}
		
		while(!stack.isEmpty())
		{
            top = stack.pop();
			area = stack.isEmpty()?h[top]*i:h[top]*(i-stack.peek()-1);	
			
			if(area<maxarea)
				maxarea = area;
		}
		return maxarea;
	    }

}
