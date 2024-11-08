package Arraylistpracticepart2;

import java.util.ArrayList;

public class Rotateelementbykthposition {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		ar1.add(6);
		System.out.println(ar1);
		int len = ar1.size();
		int temp;
		int count =0;
		while(count!=3) {
		for(int i=0;i<len;i++) {
				temp = ar1.get(i);
				ar1.set(i, ar1.get(len-1));
				ar1.set(len-1, temp);
		}
		count++;
		}
		System.out.println(ar1);
	}


}