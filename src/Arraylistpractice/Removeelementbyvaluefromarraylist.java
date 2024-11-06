package Arraylistpractice;

import java.util.ArrayList;

public class Removeelementbyvaluefromarraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(13);
		ar.add(123);
		ar.add(54);
		ar.add(1);
		int len = ar.size();
		
		//1st way
		ar.remove(Integer.valueOf(1));
		System.out.println(ar);
		
		//2nd way
		int val =  54;
		for(int i=0;i<len-1;i++) {
		if(ar.get(i)==val) {
		ar.remove(i);	
		}
		}
		System.out.println(ar);
	}

}
