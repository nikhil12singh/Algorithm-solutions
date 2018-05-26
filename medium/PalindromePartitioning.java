import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public List<List<String>> partition(String s) {
    	List<List<String>> list = new ArrayList<>();
    	if(s == null || s.length() == 0) return list;
    	partition(list,new ArrayList<>(),0,s);
    	return list;
    }
    
     public void partition(List<List<String>> list,ArrayList<String> arr,int left, String s)
    {
        	if(left==s.length())
        		list.add(new ArrayList<String>(arr));
        	
        	for(int right=left;right<s.length();right++)
        	{
        	if(isPalindrome(s,left,right))
        	{
        		arr.add(s.substring(left, right+1));
        		partition(list,arr,right+1,s);
        	    arr.remove(arr.size()-1);
        	}
        	}
    }
    
    public boolean isPalindrome(String s, int left, int right)
    {
    	
    	if(left==right)
    		return true;
    	
    	while(left<right)
    	{
    		if(s.charAt(left)!=s.charAt(right))
    			return false;
    		left++;
    		right--;
    	}
    	
    	return true;
    }}
    
