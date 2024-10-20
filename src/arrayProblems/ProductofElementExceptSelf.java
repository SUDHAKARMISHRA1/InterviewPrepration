package arrayProblems;

import java.util.ArrayList;

public class ProductofElementExceptSelf {
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		int multiple =1;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				multiple = multiple * arr[j];
			}
			if(arr[i]==1) {
				ar.add(multiple);
				multiple = 1;
			}else {
			multiple = multiple - arr[i];
			System.out.println(multiple);
			ar.add(multiple);
			multiple = 1;}
		}
		System.out.println(ar);
	}

}
