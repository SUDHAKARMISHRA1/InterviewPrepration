package StringPractice;

import java.util.HashSet;

public class FirstReccuringChar {
	
	
	public static void main(String[] args) {
		String data = "geeks";
		int len = data.length();
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<len;i++) {
			if(set.add(data.charAt(i))==false) {
				System.out.println("The first repeating char is: " +data.charAt(i));
			}
		}
	}

}
