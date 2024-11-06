package Arraylistpractice;

import java.util.ArrayList;

public class Indexofgivenvalue {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(2);
		ar.add(3);
		
		int a =  ar.indexOf(3);
		System.out.println(a);
		
	}

}
