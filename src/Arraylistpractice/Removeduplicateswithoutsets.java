package Arraylistpractice;

import java.util.ArrayList;

public class Removeduplicateswithoutsets {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(5);
		ar.add(2);
		ar.add(3);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		int len = ar.size();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(ar.get(i)!=ar.get(j) && arr.contains(ar.get(i))==false) {
					arr.add(ar.get(i));
				}else {

				}
			}
		}
		System.out.println(arr);

	}

}
