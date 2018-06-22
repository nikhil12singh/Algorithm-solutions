public class Divide {
	
	public static int divide(int dividend, int divisor) {
        int count = 0;
        boolean flag = false;
        
        if(divisor==Integer.MIN_VALUE && dividend == Integer.MAX_VALUE)
        	return 0;
        if(divisor==1)
        		return (dividend);
        if(divisor==-1)
        {
        	if(dividend == Integer.MIN_VALUE)
        		return Integer.MAX_VALUE;
        	if(dividend==Integer.MAX_VALUE)
        		return Integer.MIN_VALUE;
        	return (dividend*-1);
        }
       
        if(dividend<0 && divisor<0)
        {
        	
        	if(dividend==Integer.MIN_VALUE)
        		{
        		dividend = Integer.MAX_VALUE;
        		if(divisor==2)
        			count = 1;
        		}
        	else
        		dividend = dividend*-1;
        		
        	divisor = ((divisor==Integer.MIN_VALUE)?Integer.MAX_VALUE:(divisor*-1));
        }
        else if(dividend<0)
        {
        	if(dividend==Integer.MIN_VALUE)
    		{
    		dividend = Integer.MAX_VALUE;
    		if(divisor==2)
    			count = 1;
    		}
    	else
    		dividend = dividend*-1;
        		flag = true;
        }
        else if(divisor<0)
        {
        		divisor = ((divisor==Integer.MIN_VALUE)?Integer.MAX_VALUE:(divisor*-1));
        		flag = true;
        }
        
        while(dividend>=divisor)
        		{
        		dividend -= divisor;
        		count++;
        		}
        
        return flag?-count:count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(divide(Integer.MIN_VALUE,2));
	}
	
}
