import java.util.HashMap;
import java.util.List;
import static java.util.Arrays.*;

public class LeastBricks {

   public static int leastBricks(List<List<Integer>> wall) {
        
	   HashMap<Integer, Integer> hm = new HashMap<>();
	   int row = 0;
	   int max = 0;
	   int sum = 0;
	   int width = 0;
	   
	   for(List<Integer> list : wall)
	   { 
		for(Integer num : list)
		{
			width += num;
		}
		break;
	   }
	   
	   for(List<Integer> list : wall)
	   {
		   row++;
		   sum = 0;
		   
		for(Integer num : list)
		{
			sum += num;
			
			if(sum==width)
				continue;
			
			if(hm.containsKey(sum)) 
			{
				hm.put(sum, hm.get(sum)+1);
			}
			else
				hm.put(sum, 1);
			
			if(max<hm.get(sum))
				max = hm.get(sum);
		}
	   }
	   return (row - max);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> list = asList(
			    asList( 1,2,2,1 ),
			    asList( 3,1,2),
			    asList( 1,3,2 ),
			    asList(2,4),
			    asList(3,1,2),
			    asList(1,3,1,1));
			    
		System.out.println(leastBricks(list));
	}

}
