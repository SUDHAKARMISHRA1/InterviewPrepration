package arrayProblems;

import java.util.Arrays;

public class MaximumElement {

	public static void main(String[] args) {
		
		int arr[] = {12,11,13,16,223,45};
		
		//1st process
		/*Arrays.sort(arr);*/
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
		
		//2nd process
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]); 
	}

}
