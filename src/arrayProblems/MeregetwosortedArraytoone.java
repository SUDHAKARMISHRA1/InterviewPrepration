package arrayProblems;

import java.util.Arrays;

public class MeregetwosortedArraytoone {
	
	public static void main(String[] args) {
		int arr[] = {5,6,7,8};
		int arrr[] = {2,3,4};
		int len1 = arr.length;
		int len2= arrr.length;
		
		int sarr[] = new int[len1+len2];
		
		int i=0, j=0, k=0;
		while(i<len1) {
			sarr[k++]= arr[i++];
		}
		while(j<len2) {
			sarr[k++]= arrr[j++];
		}
		
		Arrays.sort(sarr);
		System.out.println(Arrays.toString(sarr));
		
		
	}
	
	

}
