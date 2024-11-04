package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class Alluniquecharacteringivenstring {
	
	public static void main(String[] args) {
		String data = "sudhakarmishra";
		int len = data.length();
		
		Set<Character> s = new HashSet<Character>();
		for(int i=0;i<len;i++) {
			s.add(data.charAt(i));
		}
		System.out.println(s);
		
	}

}
