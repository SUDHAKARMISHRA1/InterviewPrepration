package arrayProblemspart2;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int arr[] = {5,3,2,4,1};
		int len = arr.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}System.out.println(Arrays.toString(arr));
		
	}
}
