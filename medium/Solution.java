
public class Solution {

   static int count(int n, int k)
   {
	   int num = factorial(n, k);
	   int den = factorial(k);
	   
	   int res = num/den;
	   
	   return res;
   }
    
   static int factorial(int n, int k)
   {
       int res = 1, i;
    
       for (i=n; i>=(n-k+1); i--)
       {
    	   res *= i;
       }
    
       return res;
   }
   
   static int factorial(int n)
   {
       int res = 1, i;
       for (i=2; i<=n; i++)
           res *= i;
       return res;
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println(count(100,2));
	}

}
