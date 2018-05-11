import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        
    	if(strs == null || strs.length == 0)
    		return new ArrayList<List<String>>();
    	
    	HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    	
    	for(String s : strs)
    	{
    	char arr[] = s.toCharArray();
    	Arrays.sort(arr);
    	String str = Arrays.toString(arr);
    	
    	if(!map.containsKey(str))
    		map.put(str, new ArrayList<String>());
    	
    	map.get(str).add(s);
    	}
    	return new ArrayList<List<String>>(map.values());
    } 
}
