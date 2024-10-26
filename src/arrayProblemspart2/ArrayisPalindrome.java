package arrayProblemspart2;

public class ArrayisPalindrome {

	public static void main(String[] args) {
		int arr[] = {3, 6, 0, 6, 3};
		int len = arr.length;
		int ar[] = new int[len];
		int j=0;
		for(int i=len-1;i>=0;i--) {
			ar[j]= arr[i];
			j++;
		}		
		int status =0;
		for(int i=0;i<len;i++) {			
			if(arr[i]!=ar[i]) {
				status = 1;
				break;
			}
			else {
				status = 2;
			}

		}

		if(status == 2) {
			System.out.println("The given array is Palindrome");
		}else {
			System.out.println("The given array is not Palindrome");
		}


	}

}
