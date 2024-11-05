package Arraylistpractice;

import java.util.ArrayList;

public class BasicArrayListwork {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		System.out.println(ar);
		
		
		//adding value to specific position
		ar.add(2, 5);
		System.out.println(ar);
		
		//removing value from specific position
		ar.remove(1);
		System.out.println(ar);
		
		//Size of ArrayList
		System.out.println(ar.size());
		
		//check if element exist
		boolean b = ar.contains(4);
		System.out.println(b);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(3);
		System.out.println(ar.containsAll(arr));
	}

}
