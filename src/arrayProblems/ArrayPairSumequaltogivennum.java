package arrayProblems;

public class ArrayPairSumequaltogivennum {

	public static void main(String[] args) {
		int arr[] = {5,2,3,4,5,6,7,8};
		int target = 10;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i] + arr[j]==target) {
					System.out.println(arr[i] + "+" + arr[j] + "="+ target);
				}
			}
		}
	}
	
}
