package Arraylistpracticepart2;

import java.util.ArrayList;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(3);
		ar1.add(4);
		ar1.add(6);
		ar1.add(2);
		int len = ar1.size();
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ar1.get(i)>ar1.get(j)) {
					temp = ar1.get(i);
					ar1.set(i, ar1.get(j));
					ar1.set(j, temp);
				}
			}
		}
		System.out.println(ar1.get(len-2));
	}

}
