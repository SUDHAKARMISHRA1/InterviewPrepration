package Arraylistpracticepart2;

import java.util.ArrayList;

public class Allpairsumequaltogivenvalue {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(9);
		ar.add(-1);
		ar.add(3);
		ar.add(6);
		ar.add(5);
		int len1 = ar.size();
		int value =8;
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		for(int i=0;i<len1;i++) {
			for(int j=i+1;j<len1;j++) {
				int sum = ar.get(i)+ar.get(j);
			if(sum==value) {
				System.out.println(ar.get(i) +" " +ar.get(j));
			}	
			}
		}
	}

}
