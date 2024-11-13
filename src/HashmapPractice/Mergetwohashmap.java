package HashmapPractice;

import java.util.HashMap;

public class Mergetwohashmap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 3);
		hm.put(2, 4);
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		hm1.put(1, 5);
		hm1.put(3, 6);
		
		//1st way to replace same key and value, and add unique one
		//hm.putAll(hm1);
		
		//it will sum value of two same key
		hm1.forEach((key,value)->
		hm.merge(key, value, Integer::sum));
		
		System.out.println(hm);
	}
}
