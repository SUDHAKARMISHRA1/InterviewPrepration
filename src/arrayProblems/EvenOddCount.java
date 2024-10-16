package arrayProblems;

public class EvenOddCount {


	public static void main(String[] args) {
		int arr[] = {-1,1,0,2,3,5,6,8,10,15,18};
		int evenCount =0;
		int oddCount =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount = evenCount + 1;

			} else {
				oddCount = oddCount + 1;
			}

		}

		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
