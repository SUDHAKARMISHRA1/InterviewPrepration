package arrayProblemspart2;

import java.util.Arrays;

public class ProductofallelementExceptcurrent {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		int ar[] = new int[len];
		int product = 1;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i==j) {
					product = product*1;
				}else {
					product = product *arr[j];
				}
				ar[i]=product;
				
			}
			product =1;
		}
		System.out.println(Arrays.toString(ar));
	}

}
