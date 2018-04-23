import java.util.Arrays;

public class NextGreaterElement {

    public static int nextGreaterElement(int n) {
     
    char arr[] = String.valueOf(n).toCharArray();
    int i;
    
    for(i = arr.length-1;i>=0;i--)
    {
    if(arr[i]>arr[i-1])
    	break;
    }
 
    if(i==0)
    	return -1;
    
    char a = arr[i-1];
    int min = i;
    
    for(int j=i+1;j<arr.length;j++)
    {
    if(arr[j]>a && arr[j]<arr[min])
    	   min = j;
    }

    char temp = arr[i-1];
    arr[i-1] = arr[min];
    arr[min] = temp;
    
    Arrays.sort(arr,i,arr.length);
    
    try {
    int val = Integer.parseInt(String.valueOf(arr));
    return val;
    }
    catch(NumberFormatException ex)
    {
    	return -1;
    }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nextGreaterElement(21));
	}

}
