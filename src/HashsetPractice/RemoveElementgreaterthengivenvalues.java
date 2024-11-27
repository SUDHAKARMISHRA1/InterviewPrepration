package HashsetPractice;

import java.util.HashSet;

public class RemoveElementgreaterthengivenvalues {
	
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(5);
		s.add(4);	
		s.add(2);
		int val = 5;
		HashSet<Integer> ss = new HashSet<Integer>();
		for(Integer da : s) {
			if(da<val) {
				
				ss.add(da);
			}
		}
		System.out.println(ss);
	}

}
