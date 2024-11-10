package Arraylistpracticepart2;

import java.util.ArrayList;
import java.util.Collections;

public class medianofarraylist {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(4);
		ar.add(2);
		ar.add(6);
		ar.add(5);
		ar.add(8);
		ar.add(7);
		Collections.sort(ar);
		int len1 = ar.size();
		if(len1%2!=0) {	
			System.out.println(ar.get((len1+1)/2));
		}else {
			
			int stlargest = ar.get(len1/2-1);
			int ndlargest =ar.get(len1/2);
			double median = (stlargest+ndlargest)/2.0;
			System.out.println(median);
			
		}
	}

}
