package Arraylistpractice;

import java.util.ArrayList;

public class Updatearraylistdata {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		for(Integer value : ar) {
			ar.set(2, 6);
			System.out.println(value);
		}
		
	}

}
