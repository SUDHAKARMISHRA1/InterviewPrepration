package arrayProblemsset2;

import java.util.Arrays;

public class AlltheZerotoBegninning {
	
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,4,3,0,0,5,0};
		int len = arr.length;
		int ar[] = new int[len];
		int temp = len;
		for(int i=0;i<len;i++) {
			if(arr[i]!=0) {
				ar[temp-1]= arr[i];
				temp--;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
