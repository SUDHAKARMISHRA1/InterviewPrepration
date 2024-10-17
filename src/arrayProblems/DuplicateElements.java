package arrayProblems;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {


	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1,1,5};

		int len = arr.length;

		//1st way
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					//System.out.println("The element " + arr[i] +" is Duplicate");
				}
			}

		}



		
		//2nd Way
		Set<Integer> data = new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			if(data.add(arr[i])==false) {
				System.out.println("Duplicate Element is" +arr[i]);
			}
		}
		
		


		//check the count of 1
		int count = 0;
		for(int i=0;i<len;i++) {
			if(arr[i]==1) {
				count++;
			}

		}
		System.out.println(count);

		
		//largest frequency 
		int largestCount = 0;
		for(int i=0;i<len;i++) {
			int countt =0;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					countt++;
				}
			}
			if(largestCount<count) {
				largestCount = count;
				System.out.println(largestCount);
				System.out.println(arr[i]);
			}
		}
		
		
		
		
		
	}
}
