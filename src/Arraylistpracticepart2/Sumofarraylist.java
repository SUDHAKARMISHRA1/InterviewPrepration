package Arraylistpracticepart2;

import java.util.ArrayList;

public class Sumofarraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(4);
		ar.add(2);
		ar.add(6);
		ar.add(5);
		ar.add(8);
		ar.add(7);
		int len1 = ar.size();
		int sum =0;
		for(int i=0;i<len1;i++) {
		sum = sum +  ar.get(i);	
		}
		System.out.println(sum);
		
	}

}
