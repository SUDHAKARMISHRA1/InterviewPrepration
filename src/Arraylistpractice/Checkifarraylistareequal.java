package Arraylistpractice;

import java.util.ArrayList;

public class Checkifarraylistareequal {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(3);
		ar1.add(4);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		ar2.add(3);
		ar2.add(4);
		
		System.out.println(ar1.equals(ar2));
		
		
		
	}

}
