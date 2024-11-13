package HashmapPractice;

import java.util.HashMap;

public class AllKeysandValues {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 3);
		hm.put(2, 4);
			System.out.println(hm.keySet());
			System.out.println(hm.values());
	}

}
