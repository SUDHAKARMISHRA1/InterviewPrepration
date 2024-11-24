package HashsetPractice;

import java.util.HashSet;

public class LargestEllementinHashset {
	
	public static void main(String[] args) {
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.add(5);
		ss.add(2);
		ss.add(4);	
		ss.add(3);
		ss.add(6);	
		int max =0;
	    for(Integer val : ss) {
	    	if(max<val) {
	    		max =val;
	    	}
	    }
	    System.out.println(max);
	}

}
