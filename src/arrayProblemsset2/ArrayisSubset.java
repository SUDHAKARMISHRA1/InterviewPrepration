package arrayProblemsset2;

public class ArrayisSubset {
	
	public static void main(String[] args) {
		int A[] = {10, 5, 2, 23, 19};
		int B[] = {19, 5, 3};
		int count =0;
		//check if B is subset of A or not
		int len1 = A.length;
		int len2 = B.length;
		for(int i=0;i<len2;i++) {
			for(int j=0;j<len1;j++) {
				if(B[i]==A[j]) {
					count++;
					break;
				}
			}
		}
		if(count == len2) {
			System.out.println("B is Subset of A");
		}else {
			System.out.println("B is not a subset of A");
		}
		
		
	}

}
