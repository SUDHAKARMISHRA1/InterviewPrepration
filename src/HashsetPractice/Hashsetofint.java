package HashsetPractice;

import java.util.HashSet;

public class Hashsetofint {
	
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.add(5);
		ss.add(2);
		ss.add(3);	
		System.out.println(ss);
		set.add(1);
		set.addAll(ss);
		System.out.println(set);
	}

}
