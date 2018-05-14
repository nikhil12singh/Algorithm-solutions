
public class Pow {
	 public double myPow(double x, int n) {
	       
	        if(n==0)
	            return 1;
	        //if(n==1)
	          //  return x;
	        if(n<0)
	        {
	            if(n==Integer.MIN_VALUE)
	            {
	                n = n-1;
	                if(x<0)
	                    x = -x;
	            }
	            else
	                n = -n;
	            x = 1/x;
	        }
	        
	        return myPow(x*x,n/2) * (n%2==0?1:x);
	    }
}
