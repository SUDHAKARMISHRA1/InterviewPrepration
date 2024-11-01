package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterforString {
	
	public static void main(String[] args) {
		String name = "aasudhakarar";
		int len = name.length();
		
		
		//2nd way
//		String clean = "";
//		for(int i=0;i<len;i++) {
//			for(int j=i+1;j<len;j++) {
//				if(name.charAt(i)!=name.charAt(j)) {
//					if(clean.contains(Character.toString(name.charAt(i)))==false) {
//						clean = clean + name.charAt(i);
//					}
//				}
//			}
//		}
//		
//		System.out.println(clean);
		
		
		//1st way
//		Set<Character> s = new HashSet<Character>();
//		for(int i=0;i<len;i++) {
//			s.add(name.charAt(i));
//		}
//		System.out.println(s);
			
	}

}
