package HashmapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Keywithminimumvalues {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 3);
		hm.put(2, 4);
		hm.put(3, 12);
		hm.put(4, 4);
		int minval = Collections.min(hm.values());
		for(Entry<Integer,Integer> k :hm.entrySet()) {
			if(k.getValue()==minval) {
				System.out.println(k.getKey());
			}
		}
	}

}
