
public class RectangleArea {

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    
    	int area1 = (C-A)*(D-B);
    	int area2 = (G-E)*(H-F);
    	
    	int totalArea = area1 + area2;
    	
    	int min1 = Math.min(A,C);
    	int min2 = Math.min(E, G);
    	int max1 = Math.max(A,C);
    	int max2 = Math.max(E, G);
    	
    	int xoverlap = 0;
    	
    	if(min1<min2 && max1<min2)
    		return totalArea;
    	
    	else if(min1<min2 && max1>min2)
    	{
    		if(max1<=max2)
    			xoverlap = max1 - min2;
    		else
    			xoverlap = max2 - min2;
    	}
    	else if(min1>=min2 && min1<=max2)
    	{
    		if(max1>=max2)
    			xoverlap = max2 - min1;
    		else 
    			xoverlap = max1 - min1;
    	}
    	else if(min1>max2)
    		return totalArea;
    	
    	 int miny1 = Math.min(B,D);
     int miny2 = Math.min(F,H);
     int maxy1 = Math.max(B,D);
     int maxy2 = Math.max(F,H);
     	
    	int yoverlap = 0;
    	
    	if(miny1<miny2 && maxy1<miny2)
    		return totalArea;
    	
    	else if(miny1<miny2 && maxy1>miny2)
    	{
    		if(maxy1<=maxy2)
    			yoverlap = maxy1 - miny2;
    		else
    			yoverlap = maxy2 - miny2;
    	}
    	else if(miny1>=miny2 && miny1<=maxy2)
    	{
    		if(maxy1>=maxy2)
    			yoverlap = maxy2 - miny1;
    		else 
    			yoverlap = maxy1 - miny1;
    	}
    	else if(miny1>maxy2)
    		return totalArea;
    		
    	return (totalArea - (xoverlap*yoverlap));
    }
}
