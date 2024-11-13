package HashmapPractice;

import java.util.HashMap;
import java.util.Iterator;

public class Frequencyofeachcharingivenstring {
	
	public static void main(String[] args) {
		String data = "sudhakar";
		int len = data.length();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<len;i++) {
			if(hm.containsKey(data.charAt(i))==false) {
				hm.put(data.charAt(i), 1);
			}
			for(int j=i+1;j<len;j++) {
				if(data.charAt(i)==data.charAt(j)) {
					Iterator<Character> it = hm.keySet().iterator();
					while(it.hasNext()) {
						Character k = it.next();
						if(data.charAt(i)==k) {
							hm.put(k, hm.get(k)+1);
						}
					}
				}
			}
		}
		
		
		//2nd and optimized way
		//char[] ch = data.toCharArray();
		//for(char c : ch) {
//			if(hm.containsKey(c)) {
//				hm.put(c, hm.get(c)+1);
//			}else {
//				hm.put(c, 1);
//			}
		//}
		
		System.out.println(hm);
		
	}

}


