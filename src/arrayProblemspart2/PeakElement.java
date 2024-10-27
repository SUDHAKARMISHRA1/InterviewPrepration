package arrayProblemspart2;

public class PeakElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,6,5};
		int len = arr.length;
		if(len==1) {
			System.out.println("The Peak Element is " +arr[0]);
		}else if(arr[0]>arr[1]){
			System.out.println("The Peak Element is " +arr[0]);	
		}else {
			for(int i=0;i<len;i++) {
				if(arr[i+1]>arr[i] && arr[i+1]>arr[i+2]) {
					System.out.println("The Peak Element is " +arr[i+1]);
					break;
				}
			}
		}
		
	}
	
	
}
