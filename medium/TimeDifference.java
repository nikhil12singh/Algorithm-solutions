import java.util.Arrays;
import java.util.List;

public class TimeDifference {

    public static int findMinDifference(List<String> timePoints) {
   
    	boolean arr[] = new boolean[24*60];
    	
    	for(String str : timePoints)
    	{
      	     int num1 = Integer.parseInt(str.substring(0,2));
      	     int num2 = Integer.parseInt(str.substring(3,5));
      	     
      	     int val = num1*60 + num2;
      	     
      	     if(arr[val]==false)
      	     arr[val] = true;
      	     else
      	    	 return 0;
    	}
    	
    		int first = -1, second = -1, min = 24*60;
    	    int val = -1;	
    	
    	    for(int i=0;i<arr.length;i++)
    	    {
    		if(arr[i]==true && first == -1)
    		{
    			first = i;
    			val = first;
    		}
    		else if(arr[i]==true)
    		{
    			second = i;
    			min = Math.min(min, second - first);
    			first = second;
    		}
    	}

    	if(val>7200)
    	{
       	min = Math.min(min, second - val); 	
    	}
    	else
    	{
    		val += 24*60;
    		min = Math.min(min,val - second);
    	}
    	
    return min;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> timePoints = Arrays.asList("23:59","00:00");
		System.out.println(findMinDifference(timePoints));
		
	}

}
