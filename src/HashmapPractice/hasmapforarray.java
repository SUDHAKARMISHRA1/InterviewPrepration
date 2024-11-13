package HashmapPractice;

import java.util.HashMap;
import java.util.Map;

public class hasmapforarray {
	
	public static void main(String[] args) {
		Integer key[] = {1,2,3,4};
		Integer value[] = {5,6,7,8};
		int len= key.length;
		int len2 = value.length;
		Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++) {
			mp.put(key[i], value[i]);
		}
		System.out.println(mp);
	}

}
