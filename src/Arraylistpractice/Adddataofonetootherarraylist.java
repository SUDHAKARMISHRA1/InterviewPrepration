package Arraylistpractice;

import java.util.ArrayList;

public class Adddataofonetootherarraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(2);
		ar.add(3);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.addAll(0,ar);
		System.out.println(arr);
	}

}
