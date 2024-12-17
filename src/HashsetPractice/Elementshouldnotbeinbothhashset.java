package HashsetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Elementshouldnotbeinbothhashset {
	
	
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		Set<Integer> s2 = new HashSet<>();
		s2.addAll(Arrays.asList(new Integer[] {1,6,7,2}));
		
		Set<Integer> result = new HashSet<>();
		result.addAll(s);
		result.addAll(s2);
		Set<Integer> ro = new HashSet<>();
			for(Integer res : result) {
				for(Integer val: s) {
					for(Integer val1: s2) {
						if(res==val && val == val1) {
							ro.add(res);
						}		
					}
				}
			}
		result.removeAll(ro);
		System.out.println(result);	
	}
}
