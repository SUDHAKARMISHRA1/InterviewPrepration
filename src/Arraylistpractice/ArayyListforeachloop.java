package Arraylistpractice;

import java.util.ArrayList;

public class ArayyListforeachloop {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(2);
		ar.add(3);
		for(Integer index :ar) {
			
			System.out.println("Array data is " +index);
		}
		
	}

}
