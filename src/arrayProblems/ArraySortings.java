package arrayProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;


public class ArraySortings {

	public static void main(String[] args) {
		Integer arr[] = {12,13,11,16,223,45};

		//1st process
		/*Arrays.sort(arr);*/
		System.out.println(Arrays.toString(arr));
		

		//2nd process
		/*int temp =0;
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
		
		*/
		 
		//3rd Process for given range
		Arrays.sort(arr, 1, 4);  
		System.out.println(Arrays.toString(arr));
		
		//4th using collection reverseorder methods
		
		Arrays.sort(arr, Collections.reverseOrder());
		
	}

}
