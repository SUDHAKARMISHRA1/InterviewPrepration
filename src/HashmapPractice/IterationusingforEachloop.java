package HashmapPractice;

import java.util.HashMap;

public class IterationusingforEachloop {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "Sudhakar");
		hm.put("age", "25");
		hm.put("nam", "Sudakar");
		hm.put("ag", "5");
		int len = hm.size();
		System.out.println(len);
		hm.forEach((key,value)->
		System.out.println(key + ": " +value));
		
	}
}
