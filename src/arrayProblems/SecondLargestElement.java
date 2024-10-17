package arrayProblems;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int len = arr.length;
		int temp =0;
		for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		}
		System.out.println(arr[len-2]);
		
	}
}
