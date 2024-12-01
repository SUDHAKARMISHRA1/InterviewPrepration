package HashsetPractice;

import java.util.HashSet;

public class FirstDuplicateElementInHashset {
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,4,3,5};
		int len = arr.length;
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			if(s.add(arr[i])==false) {
				System.out.println("The first Duplicate Element is " +arr[i]);
				break;
			}
		}
	}

}
