package HashmapPractice;

import java.util.Collections;
import java.util.HashMap;

public class KeywithmaximumValue {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 3);
		hm.put(2, 4);
		hm.put(3, 12);
		hm.put(4, 4);
		System.out.println(Collections.max(hm.values()));
		System.out.println(Collections.max(hm.keySet()));
		
		
	}

}
