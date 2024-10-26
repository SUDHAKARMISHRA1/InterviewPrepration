package arrayProblemspart2;

import java.util.ArrayList;

public class ArraySumEqualtogivenvalue {

	public static void main(String[] args) {
		int arr[] = {10,50,40,30,90,10,80}; // //1,20,60,50,20,10,50
		int len = arr.length;
		int target = 100;
		int temp = target;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				temp = temp- arr[j];
				if(temp<0 && j<len-1) {	
					temp = temp + arr[j];
				}else if(temp<0 && j==len-1) {
					temp = target;
					ar.clear();
				}else if(temp ==0){
					ar.add(arr[j]);
					System.out.println(ar);
					System.out.println("The value of temp is " +temp);

				}else {
					ar.add(arr[j]);
				}

			}
		}
	}
}


