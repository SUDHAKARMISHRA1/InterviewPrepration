package HashsetPractice;

import java.util.HashSet;

public class Intersectionofhashset {
	
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
		for(Integer d : s) {
			if(ss.contains(d)) {
				sss.add(d);
			}
		}
		
		
		System.out.println(sss);
	}

}
