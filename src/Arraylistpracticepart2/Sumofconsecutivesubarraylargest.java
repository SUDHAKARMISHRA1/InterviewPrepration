package Arraylistpracticepart2;

import java.util.ArrayList;

public class Sumofconsecutivesubarraylargest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(-5);
		ar.add(4);
		ar.add(6);
		ar.add(-3);
		ar.add(4);
		ar.add(-1);
		int len1 = ar.size();
		int sum =ar.get(0);
		for(int i=0;i<len1;i++) {
			int add = 0;
			for(int j=i;j<len1;j++) {
				add = add + ar.get(j);
				if(sum<add) {
					sum =add;
				}
			}
			
		}
		System.out.println(sum);
	}
}
