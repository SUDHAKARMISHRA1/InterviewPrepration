package Arraylistpractice;

import java.util.ArrayList;

public class Frequencyofgivennumber {

	
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(3);
		ar1.add(3);
		ar1.add(3);
		ar1.add(3);
		int num = 3;
		int count =0;
		int len = ar1.size();
		for(int i=0;i<len; i++) {
			if(ar1.get(i)==num) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
