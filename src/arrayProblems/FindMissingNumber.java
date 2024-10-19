package arrayProblems;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = {12,13,15,16};
		int len = arr.length;
		int initial = arr[0];
		int finaln = arr[len-1];
		int sum =0;
		int sum2 =0;
		for(int i=0;i<len;i++) {
			sum = sum + arr[i];
		}
		for(int j=initial;j<=finaln;j++) {
			sum2 = sum2 + j;
		}

		int missingnum = sum2-sum;
		System.out.println(missingnum);

	}

}
