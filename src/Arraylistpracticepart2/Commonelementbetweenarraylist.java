package Arraylistpracticepart2;

import java.util.ArrayList;

public class Commonelementbetweenarraylist {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		ar1.add(6);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		int len = ar.size();
		int len1 = ar1.size();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len1;j++) {
				if(ar.get(i)==ar1.get(j)) {
					ar2.add(ar.get(i));
				}
			}
		}
		System.out.println(ar2);
		
	}

}
