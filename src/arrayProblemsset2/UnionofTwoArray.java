package arrayProblemsset2;

import java.util.ArrayList;

public class UnionofTwoArray {
	
	public static void main(String[] args) {
		int ar[] = {1,2,3,4};
		int len1 = ar.length;
		int arr[] = {3,4,5};
		int len2 = arr.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(ar[i]==arr[j]) {
					al.add(ar[i]);
				}
			}
		}
		System.out.println(al);
	}

}
