package HashsetPractice;

import java.util.HashSet;

public class DistinctElementinarrayusinghashset {
	
	public static void main(String[] args) {
		int ar[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<ar.length;i++) {
			hs.add(ar[i]);
		}
		System.out.println(hs.size());
	}

}
