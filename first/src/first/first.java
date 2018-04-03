package first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class first {

    
        // Complete this function
    	static int anagaram(String s){
            // Complete this function
             int count = 0;
    		 
    	        if(s.length()%2!=0)
    	            return -1;
    	        else
    	        {
    	            HashMap<Character, Integer> hm1 = new HashMap<>();
    	            HashMap<Character, Integer> hm2 = new HashMap<>();
    	            
    	        for(int i=0;i<s.length()/2;i++)
    	        {
    	            if(hm1.get(s.charAt(i))==null)
    	            	hm1.put(s.charAt(i), 1);
    	            else
    	            	hm1.put(s.charAt(i), hm1.get(s.charAt(i))+1);
    	        }
    	        
    	        for(int i=s.length()/2;i<s.length();i++)
    	        {
    	            if(hm2.get(s.charAt(i))==null)
    	            {	
    	            	
    	            	hm2.put(s.charAt(i), 1);
    	            //System.out.println(hm2.get(s.charAt(i)));
    	            }else
    	            	hm2.put(s.charAt(i), hm2.get(s.charAt(i))+1);
    	        }
    	                  
    	        Iterator it = hm2.entrySet().iterator();
    	        
    	        while (it.hasNext()) {
    	            Map.Entry pair = (Map.Entry)it.next();
                    //System.out.println("enter string"+ pair.getKey());
    	            char key = (char)pair.getKey(); 
                   // System.out.println(key);
    	            int val = (int) pair.getValue();
    	            //System.out.println(val);
    	            
    	            if(hm1.containsKey(key))
    	            {
    	            	count = count + val - hm1.get(key);
    	            }
    	            else
    	            	count = count + val;
    	        }
                    return count;
    	        }    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter value");
        int q = in.nextInt();
       
        
        for(int a0 = 0; a0 < q; a0++){
        	System.out.println("enter string");
            String s = in.next();
        	
            int result = anagaram(s);
            System.out.println(result);
        	
        	
        }
    }
}
