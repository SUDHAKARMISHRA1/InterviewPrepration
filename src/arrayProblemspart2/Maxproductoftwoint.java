package arrayProblemspart2;

public class Maxproductoftwoint {
	
	
	public static void main(String[] args) {
		int ar[] = {1, 4, 3, 6, 7, 0};
		int len = ar.length;
		int mul = ar[0]*ar[1];
		int a = 0;
		int b = 0;
		for(int i=0;i<len;i++) {
			int mul1 = 1;
			for(int j=i+1;j<len;j++) {
				if(ar[i]*ar[j]>mul1) {
					a= ar[i];
					b=ar[j];
					mul1 = ar[i]*ar[j];
				}
			}
			if(mul1>mul) {
				mul = mul1;
			}
		}
		System.out.println(a+" "+b);
		System.out.println(mul);
	}

}
