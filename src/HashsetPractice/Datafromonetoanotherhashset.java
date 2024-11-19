package HashsetPractice;

import java.util.HashSet;

public class Datafromonetoanotherhashset {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(5);
		s.add(4);	
		s.add(2);
		HashSet<Integer> ss = new HashSet<Integer>();
		
		ss.addAll(s);
		System.out.println(ss);
	}
}
