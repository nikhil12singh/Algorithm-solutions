
public class GCD {

	public static int iterative_find(int a, int b)
	{
	
		int index = a+b;
		
		for(int i=index;i>=2;i--)
	     {
		   if(a%i==0 && b%i==0)
		   { 
			   index = i;
		           break;
		    }
	     }
		
	     return index;
	}
	
	public static int recursive_find(int a, int b, int i)
	{
		if(i<2)
			return -1;
		
		if(a%i == 0 && b%i == 0)
			return i;
		else 
		{
			i--;
			return recursive_find(a,b,i);
	     }
	 }
	 
	public static int euclidean_iterative(int a, int b)
	{
	
		while(a!=b)
		{
			if(a>b)
				a = a - b;
			else
				b = b - a;
		}
		
		return a;
	}
	
	public static int euclidean_recursive(int a, int b)
	{
		if(a==0)
			return b; 
		
		return euclidean_recursive(b%a,a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(iterative_find(98,56));
		System.out.println(recursive_find(98,56,(98+56)));
		System.out.println(euclidean_iterative(98,56));
		System.out.println(euclidean_recursive(98,56));
	}

}
