package SetwithArray;

import java.util.ArrayList;

public class Intersectionoftwoarray {

	public static void main(String[] args) {
		int arr1[] = {1,2,4,2,5};
		int arr2[] =  {2,4,2,6};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					if(ar.contains(arr1[i])) {

					}
					else {
						ar.add(arr1[i]);	
					}

				}
			}
		}
		System.out.println(ar);
	}


}
