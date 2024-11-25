package Arraylistpracticepart2;

import java.util.ArrayList;

public class FirstNonRepeatingElement {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(2);
		ar.add(1);
		//ar.add(3);
		int len1 = ar.size();
		for(int i=0;i<len1;i++) {
			int j;
			for(j=0;j<len1;j++) {
				if(i!=j && ar.get(i)==ar.get(j)) {
					break;
				}
			}
			if(j==len1) {
				System.out.println(ar.get(i));
			}
		}		
	}
}
