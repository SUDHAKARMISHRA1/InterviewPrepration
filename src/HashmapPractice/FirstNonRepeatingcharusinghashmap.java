package HashmapPractice;

import java.util.HashMap;

public class FirstNonRepeatingcharusinghashmap {

	public static void main(String[] args) {
		String  data = "sudhakars";
		char[] ch = data.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}

		for(int i=0;i<ch.length;i++) {
			int val = hm.get(ch[i]);
			if(val ==1) {
				System.out.println("First non repeating char is:" +ch[i]);
				break;
			}
		}
	}

}
