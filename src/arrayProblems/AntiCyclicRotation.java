package arrayProblems;

import java.util.Arrays;

public class AntiCyclicRotation {
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		int temp =0;
		for(int i=len-1;i>=0;i--) {
			temp =arr[i];
			arr[i]= arr[len-1];
			arr[len-1]= temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
