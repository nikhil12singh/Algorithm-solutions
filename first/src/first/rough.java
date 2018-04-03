package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class rough {

	public static int reductionCost(int []num) {
	    
		int sum = 0;
	    try {
	        ArrayList<Integer> inputs = new ArrayList();

	        for (int i = 0; i < num.length; i++){
	            inputs.add(num[i]);
	        }
	        Collections.sort(inputs);

	        int lastPointer = inputs.size() - 1;
	        int initialPointer = 0;
	        

	        for(int j = initialPointer; j < inputs.size(); j++){
	            if (j + 1 < inputs.size()) {
	                sum = inputs.get(j) + inputs.get(j + 1);
	                insertAtCorrectIndex(inputs, j + 2, sum);
	                initialPointer = j + 2;
	            }
	        }

	        System.out.println(inputs.get(inputs.size() - 1));
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return sum;
	}

	private static void insertAtCorrectIndex(ArrayList<Integer> a, int startIndex, int item){
	    boolean inserted = false;
	    for (int i = startIndex; i < a.size(); i++){
	        if (item <= a.get(i)){
	            a.add(i,item);
	            inserted = true;
	            break;
	        }
	    }
	    if (inserted == false){
	        a.add(item);
	    }
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {1,2,3};
	reductionCost(a);
		
	}
	}
	
	
	

