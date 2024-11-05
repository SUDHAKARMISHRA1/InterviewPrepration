package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylisttonormalarray {

	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(13);
		ar.add(123);
		ar.add(54);
		ar.add(1);
		int len = ar.size();
		Integer[] a = new Integer[len];
		a = ar.toArray(a);
		System.out.println(Arrays.toString(a));
	}
}
