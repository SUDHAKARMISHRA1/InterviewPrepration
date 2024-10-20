package arrayProblems;

import java.util.Arrays;

public class ProductofElementExceptSelf {


	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		int arr3[] = new int[len];
		Arrays.fill(arr3, 1);
		System.out.println(Arrays.toString(arr3));
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i!=j) {
					arr3[i]=  arr3[i]*arr[j];
				}
			}

		}

		System.out.println(Arrays.toString(arr3));
	}

}
