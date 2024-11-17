package HashsetPractice;

import java.util.HashSet;

public class Unionofhashset {
	
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(5);
		s.add(2);
		s.add(4);	
		s.add(6);
		
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.add(5);
		ss.add(2);
		ss.add(4);	
		ss.add(7);
		
		HashSet<Integer> sss = new HashSet<Integer>();
		int len = s.size();
		int len1 = ss.size();
		
		for(int i =0;i<len;i++) {
			sss.addAll(s);
		}
		for(int i =0;i<len1;i++) {
			sss.addAll(ss);
		}
		System.out.println(sss);
	}
	
}
