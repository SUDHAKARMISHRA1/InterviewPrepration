package arrayProblems;

import java.util.Arrays;

public class SumofArrayElement {


	public static int getArraySum(int arr[], int len) {
		
		if(len ==0) {
			return arr[len];
		}
		return arr[len]+ getArraySum(arr, len-1);
		
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		
		//1st way
		int summ = Arrays.stream(arr).sum();
		System.out.println(summ);
		
		
		//2nd way
		int sum =0;

		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}

		System.out.println(sum);
		
		//3rd way
		System.out.println(getArraySum(arr, len-1));




	}

}
