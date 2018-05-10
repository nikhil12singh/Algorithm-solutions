
public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        
    	 if(numRows == 1)
             return s;
         
         StringBuilder sb[] = new StringBuilder[numRows];
     	
     	for(int i=0;i<numRows;i++)
     		sb[i] = new StringBuilder("");
     	
     	int index = 0;
     	int incr = 1;
         
     	for(int i=0;i<s.length();i++)
     	{
     	  sb[index].append(s.charAt(i));
     	  
     	  if(index==numRows-1)
     	      incr = -1;
     	  if(index==0 )
               incr = 1;
     	  index+=incr;
     	}
     
     	StringBuilder str = new StringBuilder("");
     
     	for(StringBuilder i:sb)
     		str.append(i);
     	
     	return str.toString();
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
