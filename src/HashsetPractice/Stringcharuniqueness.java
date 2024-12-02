package HashsetPractice;

import java.util.HashSet;

public class Stringcharuniqueness {
	
	
	public static void main(String[] args) {
		String name = "sudhS";
		char[] c = name.toLowerCase().toCharArray();
		int len = c.length;
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<len;i++) {
			if(hs.add(c[i])==false) {
				System.out.println("The given string contain duplicate character which is: " +c[i]);
				hs.clear();
				break;
			}
		}
		System.out.println(hs);
	}

}
