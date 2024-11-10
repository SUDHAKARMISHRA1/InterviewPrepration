package Arraylistpracticepart2;

import java.util.ArrayList;

public class Unionoftwoarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(5);
		ar1.add(4);
		ar1.add(6);
		ar1.add(8);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		int len1 = ar1.size();
		ar2.addAll(ar);
		for(int i=0;i<len1;i++) {
			if(ar2.contains(ar1.get(i))==false) {
			ar2.add(ar1.get(i));
			}
		}
		System.out.println(ar2);
	}
}
