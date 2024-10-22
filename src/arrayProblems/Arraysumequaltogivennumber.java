package arrayProblems;

import java.util.ArrayList;

public class Arraysumequaltogivennumber {

	public static void main(String[] args) {
		int arr[] = {10,50,40,30,90,10,80};
		int target =100;
		int sum = 0;
		int len = arr.length;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
				sum = sum+arr[i];
				if(sum<=target) {
					ar.add(arr[i]);
				} else if(sum>target) {
					sum = sum - arr[i];
			}
		}
		System.out.println(sum);
		System.out.println(ar);
	}
	
}
