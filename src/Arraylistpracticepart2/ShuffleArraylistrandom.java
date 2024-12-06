package Arraylistpracticepart2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArraylistrandom {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		//1 way
		Collections.shuffle(ar);
		System.out.println(ar);
		
		//2nd way
		
//		Random r = new Random();
//		int num = r.nextInt(ar.size());
//		for(int i=0;i<ar.size();i++) {
//			ar.add(ar.get(num));
//		}
//		System.out.println(ar);
		
	}

}
