package Arraylistpracticepart2;

import java.util.ArrayList;

public class Moveallzerotoend {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(0);
		ar.add(2);
		ar.add(3);
		ar.add(0);
		ar.add(0);
		ar.add(8);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		int len1 = ar.size();
		int zero =0;
		for(int i=0;i<len1;i++) {
			if(ar.get(i)!=0) {
				ar2.add(ar.get(i));
			}else if(ar.get(i)==0) {
				zero++;
			}
		}
		for(int i=0;i<zero;i++) {
			ar2.add(0);
		}
		System.out.println(ar2);
	}

}
