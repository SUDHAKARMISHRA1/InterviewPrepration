package arrayProblemspart2;

public class CommonElementinThreeShortedArray {


	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int[] ar1 = {4,5};
		int[] ar2 = {4,5,6,7};

		int len = ar.length;
		int len1 = ar1.length;
		int len2 = ar2.length;

		int i=0, j=0, k=0;
		while (i < len && j < len1 && k < len2) {
			if (ar[i] == ar1[j] && ar1[j] == ar2[k]) {	
				System.out.print(ar[i] + " ");
				i++;
				j++;
				k++;
			} else if (ar[i] < ar1[j]) {
				i++;
			} else if (ar1[j] < ar2[k]) {
				j++;
			} else {
				k++;
			}
		}
	}

}
