package arrayProblems;

import java.util.Arrays;

public class ReverseArrayElements {

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		//1st way
		int len =arr.length;
		int narr[] = new int[len];
		int narrlen = len;
		for(int i=0;i<len;i++) {
			narr[narrlen-1]= arr[i];
			narrlen = narrlen-1;
		}
		System.out.println(Arrays.toString(narr));
		
		//2nd way
		
		int i, t;
		for(i=0;i<len/2;i++) {
			t = arr[i];
			arr[i]= arr[len-i-1];
			arr[len-i-1]= t;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
