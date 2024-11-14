package HashmapPractice;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class KeywithmaximumValue {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 3);
		hm.put(2, 4);
		hm.put(3, 12);
		hm.put(4, 4);
		int maxval = Collections.max(hm.values());
		
		for(Entry<Integer,Integer> k :hm.entrySet()) {
			if(k.getValue()==maxval) {
				System.out.println(k.getKey());
			}
		}
		
	}

}
