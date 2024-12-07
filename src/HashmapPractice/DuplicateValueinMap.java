package HashmapPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValueinMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(4, 3);
		hm.put(2, 4);
		hm.put(5, 12);
		hm.put(6, 4);

		HashMap<Integer, Integer> valueCount = new HashMap<>();
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(valueCount.containsKey(entry.getValue())) {
				valueCount.put(
						entry.getValue(), (valueCount.get(entry.getValue()) + 1)
						);
			}
			else {
				valueCount.put(entry.getValue(), 1);
			}
		}

		for(Map.Entry<Integer, Integer> entry : valueCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +" " + entry.getValue());
			}
		}

	}

}
