package arrayProblemspart2;

public class FirstOccuranceofTragetValues {

	public static void main(String[] args) {
		int arr[] = {1,2,5,3,4,5,2,3,45};
		int target =5;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]==target) {
				System.out.println("The First Occurance of Target value is at Index " +i);
				break;
			}
		}
	}
}
