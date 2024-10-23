package arrayProblemsset2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,3,1,2};
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
		
	}
}
