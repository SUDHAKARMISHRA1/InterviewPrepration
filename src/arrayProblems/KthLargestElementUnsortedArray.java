package arrayProblems;

public class KthLargestElementUnsortedArray {

	public static void main(String[] args) {
		int arr[] = {5,23,4,2,5,3};
		int kth = 6;
		int element = 0, temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(arr[kth-1]);
	}
	
	
}
