package arrayProblemsset2;

import java.util.Arrays;

public class RotateArrayBy3PositionRight {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int len = arr.length;
		System.out.println(len);
		int temp =0 ,count =0, i=0;
		while(count!=3) {
		for(i=0;i<len;i++) {
			temp = arr[i];
			arr[i]= arr[len-1];
			arr[len-1]= temp;
			}
		count++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
