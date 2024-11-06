package Arraylistpractice;

import java.util.ArrayList;

public class EmptyArraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println(ar.isEmpty());
		ar.add(2);
		System.out.println(ar.isEmpty());
		System.out.println(ar);
		
	}

}
