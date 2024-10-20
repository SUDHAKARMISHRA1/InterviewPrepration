package arrayProblems;

public class FirstRepeatingElement {

	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,2,5};
		int len = arr.length;
		int i=0;
		while(len!=0) {
			if(arr[i]==arr[len-1]) {
				System.out.println("First Repeating Element " +arr[i]);
				break;
			}else {
				len--;
				i++;
			}
		}
	}
}
