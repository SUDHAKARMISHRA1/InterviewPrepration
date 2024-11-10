package Arraylistpracticepart2;

import java.util.ArrayList;

public class largestfrequencyelement {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(4);
		ar.add(2);
		ar.add(6);
		ar.add(5);
		ar.add(2);
		ar.add(2);
		int len1 = ar.size();
		int freq =0;
		int fnum =ar.get(0);
		for(int i=0;i<len1;i++) {
		int num =1;
		for(int j=0;j<len1;j++) {
			if(i!=j && ar.get(i)==ar.get(j)) {
				num++;
			}
		}
		if(freq<num) {
			freq = num;
			fnum = ar.get(i);
		}else {
			num =0;
		}
		}
		System.out.println(freq);
		System.out.println(fnum);
	}

}
