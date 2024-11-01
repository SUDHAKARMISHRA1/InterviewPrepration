package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterforString {
	
	public static void main(String[] args) {
		String name = "sudhakarar";
		int len = name.length();
		
		
		
		
		
		
		
		//1st way
		Set<Character> s = new HashSet<Character>();
		for(int i=0;i<len;i++) {
			s.add(name.charAt(i));
		}
		System.out.println(s);
			
	}

}
