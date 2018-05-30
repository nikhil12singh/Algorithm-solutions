import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordDictionary {
	HashMap<Integer, List<String>> hm = new  HashMap<>();
	
	 public WordDictionary() {
	        
	    }
	    
	    /** Adds a word into the data structure. */
	    public void addWord(String word) {
	        
	        int len = word.length();
	        
	        if(!hm.containsKey(len))
	        {
	        		List<String> list = new ArrayList<>();
	        		list.add(word);
	        		hm.put(len, list);
                   //System.out.println(len+" "+word);
	        }
	        else
           {
           hm.get(len).add(word);
           //System.out.println(len+" "+word);
           }
	    }
	    
	    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	    public boolean search(String word) {
	    	
	    	int len = word.length();
	    	
	    	if(!hm.containsKey(word.length()))
	    		return false;
	    	
	    		List<String> list = hm.get(len);
	    		
	    		for(String str:list)
	    		{
	    			int i = 0;
                   
	    			//System.out.println(word+" -->"+str);
                   
	    			while(i<str.length())
	    			{
	    				if(word.charAt(i)!='.' && str.charAt(i)!=word.charAt(i))
	    					break;
                         
                       //System.out.print(word.charAt(i)+" -->"+str.charAt(i)+" "+i+" ");
	    				i++;
	    			}
                   
	    			if(i==str.length())
	    				return true;	
	    		}
	    	return false;
	    }
}
