package HashsetPractice;

import java.util.HashSet;

public class ForeachonHashset {
	
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(5);
		s.add(4);	
		s.add(2);
		s.forEach((val)->System.out.println(val));
	}

}
