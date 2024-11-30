package HashsetPractice;

import java.util.HashSet;

public class Kthsmallestelement {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(7);
		s.add(10);
		s.add(4);
		s.add(3);
		s.add(20);	
		s.add(15);
		s.add(0);
		int kth = 3;
		int i =0;
		if(s.size()<kth) {
			System.out.println("Index ou of bound");
		}
		for(Integer val : s) {
			if(i==kth) {
				System.out.println(val);
			}
			i++;
		}	
	}

}
