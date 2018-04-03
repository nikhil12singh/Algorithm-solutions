package first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	static int findMaxLen(String str)
    {
       int left = 0, right = 0;
       int maxLen = -1;
       
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)=='(')
    		   left++;
    	   else
    		   right++;
    	   
    	   if(left==right)
    		   maxLen = Math.max(maxLen, 2*left);
    	   
    	   else if(right>left)
    		   left = right = 0;
       }
       
       left = right = 0;
       
       for(int i=str.length()-1;i>=0;i--)
       {
    	   if(str.charAt(i)==')')
    		   right++;
    	   else
    		   left++;
    	   
    	   if(left==right)
    		   maxLen = Math.max(maxLen, 2*left);
    	   
    	   else if(left>right)
    		   left = right = 0;
       }
       return maxLen;
    }

    public static void main(String[] args) {
      	String str = "()(()))))";
        System.out.println(findMaxLen(str));
      
        str = ")()())";
        System.out.println(findMaxLen(str));
    }
    
    }

                              
