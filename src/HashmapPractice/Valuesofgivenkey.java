package HashmapPractice;

import java.util.HashMap;
import java.util.Iterator;

public class Valuesofgivenkey {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 3);
		hm.put(2, 4);
		int key =4;
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			if(k==key) {
				int val = hm.get(k);
				System.out.println(val);
			}
		}
		
	
	}
}
