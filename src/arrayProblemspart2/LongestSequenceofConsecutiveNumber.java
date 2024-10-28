package arrayProblemspart2;

import java.util.ArrayList;

public class LongestSequenceofConsecutiveNumber {
	
	
	public static void main(String[] args) {
		int arr[] = {1, 9, 3, 10, 4, 20, 2};
		int len = arr.length;
		int longest =0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			ar.add(arr[i]);
			for(int j=i+1;j<len;j++) {
				if(arr[j]==arr[i]+1 || arr[j]==arr[i]-1) {
					ar.add(arr[j]);
				}
			}
			
		}
		
	}

}
