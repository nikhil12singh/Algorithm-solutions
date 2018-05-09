import java.util.Stack;

public class RemoveDigits {

   public static String removeKdigits(String num, int k) {
        
	   Stack<Character> stack = new Stack<>();
	   
	   if(k == num.length())
		   return "0";
	   
	   int i = 0;
	   
	   while(i<num.length())
	   {
		   if(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i))
		   {
		   stack.pop();
		   k--;
	       }
		   else
			   {
			   stack.push(num.charAt(i));
		       i++;
			   }
	    }
	
	   while(k>0)
	   {
		   stack.pop();
	       k--;
	   }
	   
	   StringBuilder str = new StringBuilder();
	   
	   while(!stack.isEmpty())
	   {
		   str.append(stack.pop());
	   }

	   str = str.reverse();
	   int j = 0;
	   
	   while(str.charAt(j)=='0')
	   {
		   str.deleteCharAt(j);
		   
		   if(str.length()==0)
			   return "0";
	   }
	     
	   return str.toString();
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(removeKdigits("10", 1));
	}

}
