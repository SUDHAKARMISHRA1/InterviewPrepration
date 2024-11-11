package Arraylistpracticepart2;

import java.util.ArrayList;

public class RemoveGreaternumthethegivenvalue {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(4);
		ar.add(3);
		ar.add(6);
		ar.add(5);
		int len1 = ar.size();
		int value =3;
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		for(int i=0;i<len1;i++) {
			if(ar.get(i)<=value) {
				ar1.add(ar.get(i));
			}
		}
		System.out.println(ar1);
	}

}
