package Arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;

public class Sortalinascendingorder {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(4);
		arr.add(1);
		arr.add(2);
		Collections.sort(arr);
		System.out.println(arr);
		
		//2nd way
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(5);
		ar.add(3);
		ar.add(4);
		ar.add(1);
		ar.add(2);
		int len = ar.size();
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ar.get(i)>ar.get(j)) {
					temp = ar.get(i);
					ar.set(i, ar.get(j));
					ar.set(j, temp);
				}
			}
		}	
		System.out.println(ar);
		
		
		
		
	}

}
