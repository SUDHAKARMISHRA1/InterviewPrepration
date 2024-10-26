package arrayProblemspart2;

public class MaximumMinimumElementInArray {


	public static void main(String[] args) {
		int arr[] = {34,3,464,545,8};
		int len =arr.length;
		int max = arr[0];
		int min =arr[0];
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}

