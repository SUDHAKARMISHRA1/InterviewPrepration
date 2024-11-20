package HashsetPractice;

import java.util.HashSet;
import java.util.Iterator;

public class IteratoronHashset {
	
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(5);
		s.add(4);	
		s.add(2);
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			int val = it.next();
			System.out.println(val);
		}
	}

}
