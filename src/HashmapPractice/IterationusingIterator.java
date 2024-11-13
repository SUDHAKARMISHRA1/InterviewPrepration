package HashmapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationusingIterator {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "Sudhakar");
		hm.put("age", "25");
		hm.put("nam", "Sudakar");
		hm.put("ag", "5");
		Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +": " +value);
				
			//System.out.println("Key = " + entry.getKey() + 
                 //   ", Value = " + entry.getValue());
		}
		
	}

}
