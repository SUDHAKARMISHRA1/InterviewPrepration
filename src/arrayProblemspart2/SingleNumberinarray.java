package arrayProblemspart2;

public class SingleNumberinarray {

	public static void main(String[] args) {
		int arr[] =  {5,2,3,2,3,1,5};
		int len = arr.length;
		int unique = 0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]!=arr[j]) {
					unique = arr[i];
				}else {
					unique =0;
				}
			}
		}
		System.out.println(unique);
	}

}
