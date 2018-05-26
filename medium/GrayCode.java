import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public static List<Integer> grayCode(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
    	for(int i=0;i<Math.pow(2, n);i++)
    		arr.add(i^(i>>1));
    	
    	return arr;
    }
}
