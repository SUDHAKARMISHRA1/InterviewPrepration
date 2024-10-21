package arrayProblems;

public class Maximumdifference {
	
	public static void main(String[] args) {
		int arr[] = {23,67,1,6,97,21,7};
		int len = arr.length;
		int maxdiff = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]-arr[j]>maxdiff) {
					maxdiff = arr[i]-arr[j];
				}
			}
		}
		for(int i=len-1;i>0;i--) {
			for(int j=i-1;j>0;j--) {
				if(arr[i]-arr[j]>maxdiff) {
					maxdiff = arr[i]-arr[j];
				}
			}
		}
		
		System.out.println(maxdiff);
	}

}
