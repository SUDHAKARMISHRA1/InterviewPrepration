package Arraylistpracticepart2;

import java.util.ArrayList;
import java.util.Collections;

public class Mergetwosortedarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(5);
		ar1.add(6);
		ar1.add(8);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		int len = ar.size();
		int len1 = ar1.size();
		for(int i=0;i<len;i++) {
			ar2.add(ar.get(i));
		}
		for(int j=0;j<len1;j++) {
			ar2.add(ar1.get(j));
		}
		Collections.sort(ar2);
		System.out.println(ar2);
	}
}
