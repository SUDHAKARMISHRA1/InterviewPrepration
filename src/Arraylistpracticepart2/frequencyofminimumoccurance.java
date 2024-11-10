package Arraylistpracticepart2;

import java.util.ArrayList;

public class frequencyofminimumoccurance {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(1);
		ar.add(4);
		ar.add(4);
		ar.add(4);
		ar.add(2);
		ar.add(5);
		ar.add(5);
		int len1 = ar.size();
		int freq =1;
		int fnum =ar.get(0);
		for(int i=0;i<len1;i++) {
		int num =1;
		for(int j=0;j<len1;j++) {
			if(i!=j && ar.get(i)==ar.get(j)) {
				num++;
			}
		}
		if(freq<num) {
			num =0;
			
		}else {
			freq = num;
			fnum = ar.get(i);
		}
		}
		System.out.println(freq);
		System.out.println(fnum);
	}

}
