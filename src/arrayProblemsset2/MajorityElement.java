package arrayProblemsset2;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 1, 3, 5, 1};
		int len = arr.length;
		int maxele = 0;
		int ele = 0;
		for(int i=0;i<len;i++) {
			int count =1;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					
					count++;
				}
			}
			if(maxele<count) {
				ele = arr[i];
				maxele = count;
			}else {
				count =0;
				
			}
		}
		if(maxele> len/2) {
			System.out.println("Majority Element is " +ele);
		}else {
			System.out.println("Majority Element is " +"-1");
		}
	}
}
