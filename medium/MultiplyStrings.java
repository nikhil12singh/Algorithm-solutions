public class MultiplyStrings {

	public static String multiply(String num1, String num2) {
		int n1 = num1.length();
		int n2 = num2.length();
		int arr[] = new int[n1+n2];
		
		for(int i=n1-1;i>=0;i--)
		{
			for(int j=n2-1;j>=0;j--)
			{
				//System.out.print((num1.charAt(i)-'0')*(num2.charAt(j)-'0')+" ");
				arr[i+j+1] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				//System.out.println(arr[i+j+1]);
				
			}
		}
		
		int len = arr.length;
		int carry = 0;
		
		for(int i=len-1;i>=0;i--)
		{
			//System.out.print(arr[i]+" ");
		   arr[i] = arr[i] + carry;
		   carry += arr[i]/10;
		   arr[i] = arr[i]%10;
		   //System.out.println(arr[i]);
		}
		
		StringBuilder str = new StringBuilder();
		
		for(int i:arr)
			str.append(i);
		
		while(str.charAt(0)=='0')
			str.deleteCharAt(0);
		
		return str.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiply("2", "3"));
	}
	
}
