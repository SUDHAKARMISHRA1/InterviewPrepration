package HashsetPractice;

import java.util.HashSet;

public class Removeduplicatesofarrayusinghashset {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,2,5,6};
		int len = arr.length;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
	}

}
