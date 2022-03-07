package amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindSum {
	
	static boolean findSumOfTwo(int[] A, int val) {
	  
		//Set<Integer> sum=Arrays.stream(A).boxed().collect(Collectors.toSet());
		
		HashSet<Integer> found=new HashSet<>();
		
		for(int a:A) {
			if(found.contains(val-a))
				return true;
		 found.add(a);
			
			
		}
		
		
	    return false;
	  } 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
		boolean output = findSumOfTwo(v, 3);
	    System.out.println(output);

	}

}
