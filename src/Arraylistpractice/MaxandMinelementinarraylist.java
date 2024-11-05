package Arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;

public class MaxandMinelementinarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(13);
		ar.add(123);
		ar.add(54);
		ar.add(1);
		int len = ar.size();
		int big = ar.get(0);
		int small = ar.get(0);
		for(int i=0;i<len;i++) {
			if(ar.get(i)>big) {
				big = ar.get(i);
			}else if(ar.get(i)<small) {
				small = ar.get(i);
			}
		}
		System.out.println(big);
		System.out.println(small);
		
		
		
		
		//1st  way
		int max = Collections.max(ar);
		int min = Collections.min(ar);
		System.out.println(max);
		System.out.println(min);
	}
	
	
}
