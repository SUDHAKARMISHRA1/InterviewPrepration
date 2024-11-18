package HashsetPractice;

import java.util.HashSet;

public class Twohashsetareequal {
	
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(5);
		s.add(4);	
		s.add(2);
		
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.add(5);
		ss.add(2);
		ss.add(6);	
		ss.add(4);
		
		if(s.equals(ss)) {
			System.out.println("Hashsets are equal");
		}else {
			System.out.println("No ther are not");
		}
	}

}
