package Arraylistpractice;

import java.util.ArrayList;

public class reverseArraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(13);
		ar.add(123);
		ar.add(54);
		ar.add(1);
		int len = ar.size();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count = len;
		while(count>0) {			
			int a = ar.get(count-1);
			arr.add(a);
			count--;
		}
		System.out.println(arr);
	}
}
