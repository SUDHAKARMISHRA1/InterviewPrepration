package arrayProblemspart2;

public class Contigioussubarraywithlargestsum {

	public static void main(String[] args) {
		int ar[] = {2, 3, -8, 7, -1, 2, 3};
		int len =ar.length;
		int sum = ar[0];
		for(int i=0;i<len;i++) {
			int count = 0;
			for(int j=i;j<len;j++) {
				count = count + ar[j];
				if(sum <count) {
					sum = count;
				}

			}	
		}
		System.out.println(sum);

	}

}
