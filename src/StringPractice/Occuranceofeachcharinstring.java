package StringPractice;

import java.util.HashMap;

public class Occuranceofeachcharinstring {

	public static void main(String[] args) {
		String name = "sudhakara";
		int len = name.length();

		HashMap<Character, Integer> a = new HashMap<Character, Integer>();
		for(int i=0;i<len;i++) {
			if(a.containsKey(name.charAt(i))) {
				int count = a.get(name.charAt(i));
				a.put(name.charAt(i), ++count);
			}else {
				a.put(name.charAt(i), 1);
			}
		}		
		//		for(int i=len-1;i>=0;i--) {
//			if(a.containsKey(name.charAt(i))) {	
//				int count = a.get(name.charAt(i));
//				a.put(name.charAt(i), ++count);
//			}else {
//				a.put(name.charAt(i), 1);
//
//			}
//
//		}

		System.out.println(a);

	}



}
