import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
    	HashSet<String> set= new HashSet<>(wordList);
    	Queue<String> queue = new LinkedList<>();
    	int level = 1;
    	queue.add(beginWord);
    	int size = queue.size();
    	
    	if(!set.contains(endWord))
    		return 0;
    	
    	while(!queue.isEmpty())
    	{
    		size--;
    		String word = queue.poll();
    		//System.out.println(word+" "+level);
    		for(int i=0;i<word.length();i++)
    		{
    			char arr[] = word.toCharArray();
    			
    			for(char j = 'a';j<='z';j++)
    			{
               arr[i] = j;
               String word1 = String.valueOf(arr);
               
               if(word1.equals(endWord))
            	   return level+1;
               
               if(set.contains(word1))
            		   {
            	         System.out.println(word1);
            	         queue.add(word1);
            	         set.remove(word1);
            		   }
    			}
    		}
    		
    		if(size==0)
    		{
    		size = queue.size();
    		level++;
    		}
    	}
    	  return 0;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
 
         	 String beginWord = "hot";
    	    		 String endWord = "dog";
    	    		 String wordList[] = {"hot","dot","dog","lot","log","cog"};
    	    		 LinkedList<String> wordList1 = new LinkedList<>(Arrays.asList("hot","dog"));
		     System.out.println(ladderLength(beginWord, endWord, wordList1));
	}
    
    
   
}
