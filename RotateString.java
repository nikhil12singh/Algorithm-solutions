import java.util.ArrayList;

public class RotateString {

public static boolean rotateString(String A, String B) {
        
	int n1 = A.length();
	int n2 = B.length();
    //System.out.println(n1);
	ArrayList<Integer> list = new ArrayList<>();
	
	if(n1 == 0 && n2 == 0)
		return true;
	
	if(n1!=n2)
		return false;
	
	int i = 0;
	
	while(i<n1)
	{
		if(B.charAt(i)==A.charAt(0))
		    list.add(i);
		i++;
	}
	boolean flag;
	
	if(list.isEmpty())
		flag = false;
	else
		flag = true;
	
	for(Integer val : list)
	{
	//System.out.println("val "+val);
	flag = true;
		
	if(val==n1)
		return false;
	
	int j = val + 1, k = 1;
	
	while(j<n1)
	{
	if(B.charAt(j)!=A.charAt(k))
	{
		flag = false;
		//System.out.println("not "+" "+k+" "+A.charAt(k)+" "+j+" "+B.charAt(j));
		break;
	}
		
	//System.out.println(k+" "+A.charAt(k)+" "+j + " "+ B.charAt(j));
	j++;
	k++;
	    
	}
	
	if(flag == false)
		continue;
	
	j = 0;
	
	while(k<n1)
	{
		if(B.charAt(j++)!=A.charAt(k++))
			{
			flag = false;
		    break;
			}
	}
	
	if(flag == false)
		continue;
	else
		return true;
	
	}
	if(flag==false)
		return false;
	return true;
    }

}
